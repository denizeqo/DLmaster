package gen;

public class AnsiiGEN {

    private String ansiCode;

    public void generateANSI(Person person) {
        StringBuilder ansiCodeBuilder = new StringBuilder();

        ansiCodeBuilder.append("@");
        ansiCodeBuilder.append("ANSI 636001030302DL00410275Z");
        ansiCodeBuilder.append("DCS").append(person.getLastName());
        ansiCodeBuilder.append("DAC").append(person.getFirstName());
        ansiCodeBuilder.append("DBB").append(person.getDob());
        ansiCodeBuilder.append("DBC").append(person.getGender());
        ansiCodeBuilder.append("DAU").append(person.getHeight());
        ansiCodeBuilder.append("DAG").append(person.getAddress());
        ansiCodeBuilder.append("DAI").append(person.getCity());
        ansiCodeBuilder.append("DAJ").append(person.getState());
        ansiCodeBuilder.append("DAK").append(person.getZip());
        ansiCodeBuilder.append("DAQ").append(person.getCustomerId());
        ansiCodeBuilder.append("LF");

        this.ansiCode = ansiCodeBuilder.toString();
    }

    public String getAnsiCode() {
        return ansiCode;
    }
}
