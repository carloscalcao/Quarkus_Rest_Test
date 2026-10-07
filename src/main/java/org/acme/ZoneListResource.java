package org.acme;

import jakarta.ws.rs.*;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Path("/api/ZonesList")
public class ZoneListResource {

    public record Zones(Integer id, String name) {}


    private final List<Zones> zones = new CopyOnWriteArrayList<>(
        List.of(
            new Zones(0, "Todas"),
            new Zones(1, "Aveiro"),
            new Zones(2, "Beja"),
            new Zones(3, "Braga")
        )
        
    );


    @GET
    public List<Zones> returnList() {
        return zones;
    }

}