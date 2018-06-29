package Exercises_P06_FootballTeamGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Team> teams = new LinkedHashMap<>();
        Map<String, Player> playerss = new LinkedHashMap<>();
        while (true) {
            String[] inputs = reader.readLine().split(";");
            if ("END".equalsIgnoreCase(inputs[0])) {
                break;
            }
            if ("Team".equals(inputs[0])) {
                String nameTeam = inputs[1];
                Team team = new Team(nameTeam);
                teams.putIfAbsent(nameTeam, team);
            }
            if ("Add".equals(inputs[0])) {
                String nameTeam = inputs[1];
                String player = inputs[2];
                if(!teams.containsKey(nameTeam)) {
                    System.out.printf("Team %s does not exist.\n", nameTeam);
                }else{
                    List<Stats> stats = new ArrayList<>();
                double endurance = Double.parseDouble(inputs[3]);
                Stats stat=null;
                try{
                     stat = new Stats("Endurance",endurance);
                }catch(IllegalArgumentException iae){
                    System.out.println(iae.getMessage());
                    continue;
                }
                if(stat!=null){
                    stats.add(stat);
                }
                double sprint = Double.parseDouble(inputs[4]);
                try{
                    stat = new Stats("Sprint",sprint);
                }catch(IllegalArgumentException iae){
                    System.out.println(iae.getMessage());
                    continue;
                }
                if(stat!=null){
                    stats.add(stat);
                }
                double drible = Double.parseDouble(inputs[5]);
                try{
                    stat = new Stats("Drible",drible);
                }catch(IllegalArgumentException iae){
                    System.out.println(iae.getMessage());
                    continue;
                }
                if(stat!=null){
                    stats.add(stat);
                }
                double passing = Double.parseDouble(inputs[6]);
                try{
                    stat = new Stats("Passing",passing);
                }catch(IllegalArgumentException iae){
                    System.out.println(iae.getMessage());
                    continue;
                }
                if(stat!=null){
                    stats.add(stat);
                }
                double shooting = Double.parseDouble(inputs[7]);
                try{
                    stat = new Stats("Shooting",shooting);
                }catch(IllegalArgumentException iae){
                    System.out.println(iae.getMessage());
                    continue;
                }
                if(stat!=null){
                    stats.add(stat);
                }
                Player players = new Player(player, stats);
                playerss.putIfAbsent(player,players);
                teams.get(nameTeam).getPlayer().add(players);
                }
            }
            if("Remove".equals(inputs[0])){
                String nameTeam=inputs[1];
                String namePlayer=inputs[2];
                if(!teams.containsKey(nameTeam)) {
                    System.out.printf("Team %s does not exist.\n", nameTeam);
                }else {
                    Player pl = new Player(namePlayer);
                    for (Player player : teams.get(nameTeam).getPlayer()) {
                        String name = player.getName();
                        if (namePlayer.equals(name)) {
                            pl = player;
                        }
                    }
                    try {
                        teams.get(nameTeam).removePlayer(pl);
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                }
            }
            if("Rating".equals(inputs[0])){
                String teamName=inputs[1];
                if(!teams.containsKey(teamName)) {
                    System.out.printf("Team %s does not exist.\n", teamName);
                }else {
                    double range = teams.get(teamName).calculateRatings();
                        System.out.printf("%s - %.0f\n", teamName, range);
                    }
                }
            }
        }
    }
