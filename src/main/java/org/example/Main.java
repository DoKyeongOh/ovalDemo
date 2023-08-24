package org.example;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import org.example.oval.OvalDefinitionsInspector;
import org.example.oval.OvalDefinitionsLoader;
import org.example.oval.OvalInspectResult;
import org.mitre.oval.xmlschema.oval_definitions_5.OvalDefinitions;

import java.io.File;

public class Main {

    public static class CommandMain {
        @Parameter(names = "--results", description = "result file", required = false)
        private String results;

        @Parameter(description = "input definition file", required = true)
        private String definitions;

        public String getResults() {
            return results;
        }

        public void setResults(String results) {
            this.results = results;
        }

        public String getDefinitions() {
            return definitions;
        }

        public void setDefinitions(String definitions) {
            this.definitions = definitions;
        }

        @Override
        public String toString() {
            return "CommandMain{" +
                    "results='" + results + '\'' +
                    ", definitions='" + definitions + '\'' +
                    '}';
        }
    }
    public static void main( String[] args ) {
        CommandMain cmdMain = new CommandMain();
        JCommander jc = JCommander.newBuilder().addObject(cmdMain).build();
        jc.parse(args);
        try {
            File ovalDefFile = new File("src/main/resources/unix.test.vulnerability.xml");
            execute(ovalDefFile, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void execute(File ovalDefFile, File resultsFile) throws Exception {
        OvalDefinitionsLoader ovalDefinitionsLoader = new OvalDefinitionsLoader();
        OvalDefinitions ovalDefinitions = ovalDefinitionsLoader.load(ovalDefFile);
        OvalDefinitionsInspector ovalDefinitionsInspector = new OvalDefinitionsInspector();
        OvalInspectResult inspectResult = ovalDefinitionsInspector.inspect(ovalDefinitions);
        System.out.println(inspectResult);
    }
}
