@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	assertEquals("Должно вернуться " + true + ", так как пользователю " + 19 + " лет",true, isAdult);
}
