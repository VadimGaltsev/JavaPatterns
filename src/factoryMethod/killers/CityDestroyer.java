package factoryMethod.killers;

import factoryMethod.models.City;

class CityDestroyer extends Robot {

    City mCity;

    public CityDestroyer(City city) {
        mCity = city;
    }

    @Override
    public void killPeople() {
        mCity.setCitySize(0);
        mCity.setState("DESTROYED");
    }
}
