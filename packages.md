## Packages

<!--
<plugin>
          <groupId>org.codehaus.mojo</groupId>
          <artifactId>exec-maven-plugin</artifactId>
          <configuration>
              <executable>java</executable>
              <arguments>
                  <argument>--module-path</argument>
                  <modulepath/>
                  <argument>--module</argument>

              </arguments>
          </configuration>
      </plugin>
-->
      
      
      
      
      <!--


            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-jlink-plugin</artifactId>
                <extensions>true</extensions>
                <configuration>
                    <!-- configuration elements goes here -->
            <!-- <launcher>reactorapp=com.reactor.project.app/com.reactor.project.app.App</launcher>-->
            
            
        </configuration>

        <executions>
            <execution>
                <phase>package</phase>
                <goals>
                    <goal>link</goal>
                </goals>
                <configuration>
                    <modulePath>${project.build.directory}/modules</modulePath>
                    <module>your.module.name</module>
                    <output>${project.build.directory}/image</output>
                </configuration>
            </execution>
        </executions>
    </plugin>
-->