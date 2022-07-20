package it.euris.patterns.behavioral.template.exercise;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public abstract class DayTemplate {

    private List<Athlete> athleteList;

    public final void startDay() {
        initPartecipants();
        morningMatch();
        System.out.println("Time for lunch");
        afternoonMatch();
        System.out.println("Time for dinner");
    }


    public abstract void afternoonMatch();

    public abstract void morningMatch();

    private void initPartecipants() {
        List<Athlete> athletes = new ArrayList<>();
        athletes.add(new Athlete("Marco"));
        athletes.add(new Athlete("Giovanni"));
        athletes.add(new Athlete("Paolo"));
        athletes.add(new Athlete("Luca"));
        this.athleteList = athletes;
    }

}

class Day1 extends DayTemplate {

    @Override
    public void morningMatch() {
        List<Athlete> athleteList = getAthleteList();
        // TODO Search athlete with max swim performance
        System.out.println("Winner of Swim: " + athleteList.get(0).getName());
    }

    @Override
    public void afternoonMatch() {
        List<Athlete> athleteList = getAthleteList();
        // TODO Search athlete with max run performance
        System.out.println("Winner of Swim: " + athleteList.get(2).getName());

    }


}

class Day2 extends DayTemplate {

    @Override
    public void morningMatch() {
        List<Athlete> athleteList = getAthleteList();
        // TODO Search athlete with max throw performance
        System.out.println("Winner of Swim: " + athleteList.get(2).getName());

    }

    @Override
    public void afternoonMatch() {
        List<Athlete> athleteList = getAthleteList();
        // TODO Search athlete with max jump performance
        System.out.println("Winner of Swim: " + athleteList.get(0).getName());
    }

}


class Day3 extends DayTemplate {

    @Override
    public void morningMatch() {
        List<Athlete> athleteList = getAthleteList();
        // TODO Search athlete with max drink performance
        System.out.println("Winner of Swim: " + athleteList.get(1).getName());

    }

    @Override
    public void afternoonMatch() {
        System.out.println("Finish, let's party");
    }

}