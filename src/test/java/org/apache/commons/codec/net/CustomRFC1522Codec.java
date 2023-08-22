/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.codec.net;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

/**
 * Tests overriding the package private RFC1522Codec.
 */
public class CustomRFC1522Codec extends RFC1522Codec {

    @Override
    protected String getEncoding() {
        return null;
    }

    @Override
    protected byte[] doEncoding(byte[] bytes) throws EncoderException {
        return null;
    }

    @Override
    protected byte[] doDecoding(byte[] bytes) throws DecoderException {
        return null;
    }

    @Override
    protected String encodeText(String text, Charset charset) throws EncoderException {
        return super.encodeText(text, charset);
    }

    @Override
    protected String encodeText(String text, String charsetName) throws EncoderException, UnsupportedEncodingException {
        return super.encodeText(text, charsetName);
    }

    @Override
    protected String decodeText(String text) throws DecoderException, UnsupportedEncodingException {
        return super.decodeText(text);
    }

}