package Exercises_P09_Google;

import java.util.List;

public class Person {
    private String name;
    private List<Parents> parents;
    private List<Children> children;
    private Company company;
    private List<Pokemon> pokemon;
    private Car car;

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Pokemon> getPokemon() {
        return this.pokemon;
    }

    public List<Parents> getParents() {
        return this.parents;
    }

    public List<Children> getChildren() {
        return this.children;
    }

    public void setPokemon(List<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }


    public void setChildren(List<Children> children) {
        this.children = children;
    }

    public void setParents(List<Parents> parents) {
        this.parents = parents;
    }

    @Override
    public String toString() {
        StringBuilder person = new StringBuilder();
        person.append(this.name).append(System.lineSeparator())
                .append("Company:\n");
        if (this.company != null) {
            person.append(String.format("%s %s %.2f\n", this.company.getCompnayName(), this.company.getDepartment(), this.company.getSalary()));
        }
        person.append("Car:\n");
        if(this.car!=null){
            person.append(String.format("%s %d\n",this.car.getCarModel(),this.car.getCarSpeed()));
        }
        person.append("Pokemon:\n");
        if(this.pokemon!=null){
            for (Pokemon pok : this.pokemon) {
                person.append(String.format("%s %s\n",pok.getPokemonName(),pok.getPokemonType()));
            }
        }
        person.append("Parents:\n");
        if(this.parents!=null){
            for (Parents par : this.parents) {
                person.append(String.format("%s %s\n",par.getParentName(),par.getParentBirthday()));
            }
        }
        person.append("Children:\n");
        if(this.children!=null){
            for (Children child : this.children) {
                person.append(String.format("%s %s\n",child.getChildrenName(),child.getChildrenBirthday()));
            }
        }
return person.toString();
    }
}
