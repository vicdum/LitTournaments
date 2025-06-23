package me.waterarchery.littournaments.models;

import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;

import java.util.UUID;

@Getter
public class TournamentValue {

    private final UUID uuid;
    private final long value;

    public TournamentValue(UUID uuid, long value) {
        this.uuid = uuid;
        this.value = value;
    }

    public String getName() {
        OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(uuid);
        return offlinePlayer.getName();
    }

}
