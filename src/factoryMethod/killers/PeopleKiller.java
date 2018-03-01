package factoryMethod.killers;

import factoryMethod.models.People;

class PeopleKiller extends Robot {

    People mPeople;

    public PeopleKiller(People people) {
        mPeople = people;
    }

    @Override
    public void killPeople() {
        mPeople.setCount(0);
        mPeople.setState("KILLED");
    }
}