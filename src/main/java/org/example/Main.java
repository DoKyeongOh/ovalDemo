package org.example;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import org.mitre.oval.xmlschema.oval_definitions_5.*;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public static void execute(File ovalDefFile, File resultsFile) throws JAXBException, IOException {
        OvalDefinitionsLoader ovalDefinitionsLoader = new OvalDefinitionsLoader();
        OvalDefinitions ovalDefinitions = ovalDefinitionsLoader.load(ovalDefFile);
        DefinitionsType definitions = ovalDefinitions.getDefinitions();
        List<DefinitionType> definitionTypes = definitions.getDefinition();

        // extract test id list for executing only one. 
        // 실행할 테스트 아이디만 먼저 추출 -> 테스트를 한 번씩만 추출하기 위함
        List<String> testIds = new ArrayList<>();
        for (DefinitionType definitionType : definitionTypes) {
            CriteriaType criteriaType = definitionType.getCriteria();
            for (Object object : criteriaType.getCriteriaOrCriterionOrExtendDefinition()) {
                if (object instanceof CriterionType == false)
                    continue;
                String testRefId = ((CriterionType) object).getTestRef();
                testIds.add(testRefId);
            }
        }

        // execute tests
        // 테스트 실시해서 결과를 담기
        Map<String, Boolean> testResultMap = new HashMap<>();
        for (String testId : testIds) {

        }

        // by using "testResultMap" make result of criteria
        // testResultMap을 사용해서 각 definition에 정의된 criteria가 충족되는지 체크 실시
        for (DefinitionType definitionType : definitionTypes) {

        }
    }
}
