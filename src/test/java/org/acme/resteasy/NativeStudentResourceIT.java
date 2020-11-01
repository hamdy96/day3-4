package org.acme.resteasy;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeStudentResourceIT extends StudentResourceTest {

    // Execute the same tests but in native mode.
}