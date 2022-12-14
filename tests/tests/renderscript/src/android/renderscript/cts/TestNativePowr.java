/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Don't edit this file!  It is auto-generated by frameworks/rs/api/gen_runtime.

package android.renderscript.cts;

import android.renderscript.Allocation;
import android.renderscript.RSRuntimeException;
import android.renderscript.Element;

public class TestNativePowr extends RSBaseCompute {

    private ScriptC_TestNativePowr script;
    private ScriptC_TestNativePowrRelaxed scriptRelaxed;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        script = new ScriptC_TestNativePowr(mRS);
        scriptRelaxed = new ScriptC_TestNativePowrRelaxed(mRS);
    }

    public class ArgumentsFloatFloatFloat {
        public float inV;
        public float inY;
        public Target.Floaty out;
    }

    private void checkNativePowrFloatFloatFloat() {
        Allocation inV = createRandomFloatAllocation(mRS, Element.DataType.FLOAT_32, 1, 0x3c3550bdff7a10c2l, 0, 256);
        Allocation inY = createRandomFloatAllocation(mRS, Element.DataType.FLOAT_32, 1, 0x3c3550bdff7a10c5l, -15, 15);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            script.set_gAllocInY(inY);
            script.forEach_testNativePowrFloatFloatFloat(inV, out);
            verifyResultsNativePowrFloatFloatFloat(inV, inY, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativePowrFloatFloatFloat: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 1), INPUTSIZE);
            scriptRelaxed.set_gAllocInY(inY);
            scriptRelaxed.forEach_testNativePowrFloatFloatFloat(inV, out);
            verifyResultsNativePowrFloatFloatFloat(inV, inY, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativePowrFloatFloatFloat: " + e.toString());
        }
    }

    private void verifyResultsNativePowrFloatFloatFloat(Allocation inV, Allocation inY, Allocation out, boolean relaxed) {
        float[] arrayInV = new float[INPUTSIZE * 1];
        inV.copyTo(arrayInV);
        float[] arrayInY = new float[INPUTSIZE * 1];
        inY.copyTo(arrayInY);
        float[] arrayOut = new float[INPUTSIZE * 1];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 1 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloatFloat args = new ArgumentsFloatFloatFloat();
                args.inV = arrayInV[i];
                args.inY = arrayInY[i];
                // Figure out what the outputs should have been.
                Target target = new Target(relaxed);
                CoreMathVerifier.computeNativePowr(args, target);
                // Validate the outputs.
                boolean valid = true;
                if (!args.out.couldBe(arrayOut[i * 1 + j])) {
                    valid = false;
                }
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append("Input inV: ");
                    message.append(String.format("%14.8g {%8x} %15a",
                            args.inV, Float.floatToRawIntBits(args.inV), args.inV));
                    message.append("\n");
                    message.append("Input inY: ");
                    message.append(String.format("%14.8g {%8x} %15a",
                            args.inY, Float.floatToRawIntBits(args.inY), args.inY));
                    message.append("\n");
                    message.append("Expected output out: ");
                    message.append(args.out.toString());
                    message.append("\n");
                    message.append("Actual   output out: ");
                    message.append(String.format("%14.8g {%8x} %15a",
                            arrayOut[i * 1 + j], Float.floatToRawIntBits(arrayOut[i * 1 + j]), arrayOut[i * 1 + j]));
                    if (!args.out.couldBe(arrayOut[i * 1 + j])) {
                        message.append(" FAIL");
                    }
                    message.append("\n");
                    assertTrue("Incorrect output for checkNativePowrFloatFloatFloat" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    private void checkNativePowrFloat2Float2Float2() {
        Allocation inV = createRandomFloatAllocation(mRS, Element.DataType.FLOAT_32, 2, 0xdbc56fbe7733c926l, 0, 256);
        Allocation inY = createRandomFloatAllocation(mRS, Element.DataType.FLOAT_32, 2, 0xdbc56fbe7733c929l, -15, 15);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 2), INPUTSIZE);
            script.set_gAllocInY(inY);
            script.forEach_testNativePowrFloat2Float2Float2(inV, out);
            verifyResultsNativePowrFloat2Float2Float2(inV, inY, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativePowrFloat2Float2Float2: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 2), INPUTSIZE);
            scriptRelaxed.set_gAllocInY(inY);
            scriptRelaxed.forEach_testNativePowrFloat2Float2Float2(inV, out);
            verifyResultsNativePowrFloat2Float2Float2(inV, inY, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativePowrFloat2Float2Float2: " + e.toString());
        }
    }

    private void verifyResultsNativePowrFloat2Float2Float2(Allocation inV, Allocation inY, Allocation out, boolean relaxed) {
        float[] arrayInV = new float[INPUTSIZE * 2];
        inV.copyTo(arrayInV);
        float[] arrayInY = new float[INPUTSIZE * 2];
        inY.copyTo(arrayInY);
        float[] arrayOut = new float[INPUTSIZE * 2];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 2 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloatFloat args = new ArgumentsFloatFloatFloat();
                args.inV = arrayInV[i * 2 + j];
                args.inY = arrayInY[i * 2 + j];
                // Figure out what the outputs should have been.
                Target target = new Target(relaxed);
                CoreMathVerifier.computeNativePowr(args, target);
                // Validate the outputs.
                boolean valid = true;
                if (!args.out.couldBe(arrayOut[i * 2 + j])) {
                    valid = false;
                }
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append("Input inV: ");
                    message.append(String.format("%14.8g {%8x} %15a",
                            args.inV, Float.floatToRawIntBits(args.inV), args.inV));
                    message.append("\n");
                    message.append("Input inY: ");
                    message.append(String.format("%14.8g {%8x} %15a",
                            args.inY, Float.floatToRawIntBits(args.inY), args.inY));
                    message.append("\n");
                    message.append("Expected output out: ");
                    message.append(args.out.toString());
                    message.append("\n");
                    message.append("Actual   output out: ");
                    message.append(String.format("%14.8g {%8x} %15a",
                            arrayOut[i * 2 + j], Float.floatToRawIntBits(arrayOut[i * 2 + j]), arrayOut[i * 2 + j]));
                    if (!args.out.couldBe(arrayOut[i * 2 + j])) {
                        message.append(" FAIL");
                    }
                    message.append("\n");
                    assertTrue("Incorrect output for checkNativePowrFloat2Float2Float2" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    private void checkNativePowrFloat3Float3Float3() {
        Allocation inV = createRandomFloatAllocation(mRS, Element.DataType.FLOAT_32, 3, 0x302a4dde7911cac7l, 0, 256);
        Allocation inY = createRandomFloatAllocation(mRS, Element.DataType.FLOAT_32, 3, 0x302a4dde7911cacal, -15, 15);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 3), INPUTSIZE);
            script.set_gAllocInY(inY);
            script.forEach_testNativePowrFloat3Float3Float3(inV, out);
            verifyResultsNativePowrFloat3Float3Float3(inV, inY, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativePowrFloat3Float3Float3: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 3), INPUTSIZE);
            scriptRelaxed.set_gAllocInY(inY);
            scriptRelaxed.forEach_testNativePowrFloat3Float3Float3(inV, out);
            verifyResultsNativePowrFloat3Float3Float3(inV, inY, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativePowrFloat3Float3Float3: " + e.toString());
        }
    }

    private void verifyResultsNativePowrFloat3Float3Float3(Allocation inV, Allocation inY, Allocation out, boolean relaxed) {
        float[] arrayInV = new float[INPUTSIZE * 4];
        inV.copyTo(arrayInV);
        float[] arrayInY = new float[INPUTSIZE * 4];
        inY.copyTo(arrayInY);
        float[] arrayOut = new float[INPUTSIZE * 4];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 3 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloatFloat args = new ArgumentsFloatFloatFloat();
                args.inV = arrayInV[i * 4 + j];
                args.inY = arrayInY[i * 4 + j];
                // Figure out what the outputs should have been.
                Target target = new Target(relaxed);
                CoreMathVerifier.computeNativePowr(args, target);
                // Validate the outputs.
                boolean valid = true;
                if (!args.out.couldBe(arrayOut[i * 4 + j])) {
                    valid = false;
                }
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append("Input inV: ");
                    message.append(String.format("%14.8g {%8x} %15a",
                            args.inV, Float.floatToRawIntBits(args.inV), args.inV));
                    message.append("\n");
                    message.append("Input inY: ");
                    message.append(String.format("%14.8g {%8x} %15a",
                            args.inY, Float.floatToRawIntBits(args.inY), args.inY));
                    message.append("\n");
                    message.append("Expected output out: ");
                    message.append(args.out.toString());
                    message.append("\n");
                    message.append("Actual   output out: ");
                    message.append(String.format("%14.8g {%8x} %15a",
                            arrayOut[i * 4 + j], Float.floatToRawIntBits(arrayOut[i * 4 + j]), arrayOut[i * 4 + j]));
                    if (!args.out.couldBe(arrayOut[i * 4 + j])) {
                        message.append(" FAIL");
                    }
                    message.append("\n");
                    assertTrue("Incorrect output for checkNativePowrFloat3Float3Float3" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    private void checkNativePowrFloat4Float4Float4() {
        Allocation inV = createRandomFloatAllocation(mRS, Element.DataType.FLOAT_32, 4, 0x848f2bfe7aefcc68l, 0, 256);
        Allocation inY = createRandomFloatAllocation(mRS, Element.DataType.FLOAT_32, 4, 0x848f2bfe7aefcc6bl, -15, 15);
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 4), INPUTSIZE);
            script.set_gAllocInY(inY);
            script.forEach_testNativePowrFloat4Float4Float4(inV, out);
            verifyResultsNativePowrFloat4Float4Float4(inV, inY, out, false);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativePowrFloat4Float4Float4: " + e.toString());
        }
        try {
            Allocation out = Allocation.createSized(mRS, getElement(mRS, Element.DataType.FLOAT_32, 4), INPUTSIZE);
            scriptRelaxed.set_gAllocInY(inY);
            scriptRelaxed.forEach_testNativePowrFloat4Float4Float4(inV, out);
            verifyResultsNativePowrFloat4Float4Float4(inV, inY, out, true);
        } catch (Exception e) {
            throw new RSRuntimeException("RenderScript. Can't invoke forEach_testNativePowrFloat4Float4Float4: " + e.toString());
        }
    }

    private void verifyResultsNativePowrFloat4Float4Float4(Allocation inV, Allocation inY, Allocation out, boolean relaxed) {
        float[] arrayInV = new float[INPUTSIZE * 4];
        inV.copyTo(arrayInV);
        float[] arrayInY = new float[INPUTSIZE * 4];
        inY.copyTo(arrayInY);
        float[] arrayOut = new float[INPUTSIZE * 4];
        out.copyTo(arrayOut);
        for (int i = 0; i < INPUTSIZE; i++) {
            for (int j = 0; j < 4 ; j++) {
                // Extract the inputs.
                ArgumentsFloatFloatFloat args = new ArgumentsFloatFloatFloat();
                args.inV = arrayInV[i * 4 + j];
                args.inY = arrayInY[i * 4 + j];
                // Figure out what the outputs should have been.
                Target target = new Target(relaxed);
                CoreMathVerifier.computeNativePowr(args, target);
                // Validate the outputs.
                boolean valid = true;
                if (!args.out.couldBe(arrayOut[i * 4 + j])) {
                    valid = false;
                }
                if (!valid) {
                    StringBuilder message = new StringBuilder();
                    message.append("Input inV: ");
                    message.append(String.format("%14.8g {%8x} %15a",
                            args.inV, Float.floatToRawIntBits(args.inV), args.inV));
                    message.append("\n");
                    message.append("Input inY: ");
                    message.append(String.format("%14.8g {%8x} %15a",
                            args.inY, Float.floatToRawIntBits(args.inY), args.inY));
                    message.append("\n");
                    message.append("Expected output out: ");
                    message.append(args.out.toString());
                    message.append("\n");
                    message.append("Actual   output out: ");
                    message.append(String.format("%14.8g {%8x} %15a",
                            arrayOut[i * 4 + j], Float.floatToRawIntBits(arrayOut[i * 4 + j]), arrayOut[i * 4 + j]));
                    if (!args.out.couldBe(arrayOut[i * 4 + j])) {
                        message.append(" FAIL");
                    }
                    message.append("\n");
                    assertTrue("Incorrect output for checkNativePowrFloat4Float4Float4" +
                            (relaxed ? "_relaxed" : "") + ":\n" + message.toString(), valid);
                }
            }
        }
    }

    public void testNativePowr() {
        checkNativePowrFloatFloatFloat();
        checkNativePowrFloat2Float2Float2();
        checkNativePowrFloat3Float3Float3();
        checkNativePowrFloat4Float4Float4();
    }
}
