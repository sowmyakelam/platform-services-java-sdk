/*
 * (C) Copyright IBM Corp. 2025.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.platform_services.global_catalog.v1.model;

import com.ibm.cloud.platform_services.global_catalog.v1.model.Bullets;
import com.ibm.cloud.platform_services.global_catalog.v1.model.Strings;
import com.ibm.cloud.platform_services.global_catalog.v1.model.UIMediaSourceMetaData;
import com.ibm.cloud.platform_services.global_catalog.v1.model.UIMetaMedia;
import com.ibm.cloud.platform_services.global_catalog.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Strings model.
 */
public class StringsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testStrings() throws Throwable {
    Bullets bulletsModel = new Bullets.Builder()
      .title("testString")
      .description("testString")
      .icon("testString")
      .quantity(Long.valueOf("26"))
      .build();
    assertEquals(bulletsModel.title(), "testString");
    assertEquals(bulletsModel.description(), "testString");
    assertEquals(bulletsModel.icon(), "testString");
    assertEquals(bulletsModel.quantity(), Long.valueOf("26"));

    UIMediaSourceMetaData uiMediaSourceMetaDataModel = new UIMediaSourceMetaData.Builder()
      .type("testString")
      .url("testString")
      .build();
    assertEquals(uiMediaSourceMetaDataModel.type(), "testString");
    assertEquals(uiMediaSourceMetaDataModel.url(), "testString");

    UIMetaMedia uiMetaMediaModel = new UIMetaMedia.Builder()
      .caption("testString")
      .thumbnailUrl("testString")
      .type("testString")
      .url("testString")
      .source(java.util.Arrays.asList(uiMediaSourceMetaDataModel))
      .build();
    assertEquals(uiMetaMediaModel.caption(), "testString");
    assertEquals(uiMetaMediaModel.thumbnailUrl(), "testString");
    assertEquals(uiMetaMediaModel.type(), "testString");
    assertEquals(uiMetaMediaModel.url(), "testString");
    assertEquals(uiMetaMediaModel.source(), java.util.Arrays.asList(uiMediaSourceMetaDataModel));

    Strings stringsModel = new Strings.Builder()
      .bullets(java.util.Arrays.asList(bulletsModel))
      .media(java.util.Arrays.asList(uiMetaMediaModel))
      .notCreatableMsg("testString")
      .notCreatableRobotMsg("testString")
      .deprecationWarning("testString")
      .popupWarningMessage("testString")
      .instruction("testString")
      .build();
    assertEquals(stringsModel.bullets(), java.util.Arrays.asList(bulletsModel));
    assertEquals(stringsModel.media(), java.util.Arrays.asList(uiMetaMediaModel));
    assertEquals(stringsModel.notCreatableMsg(), "testString");
    assertEquals(stringsModel.notCreatableRobotMsg(), "testString");
    assertEquals(stringsModel.deprecationWarning(), "testString");
    assertEquals(stringsModel.popupWarningMessage(), "testString");
    assertEquals(stringsModel.instruction(), "testString");

    String json = TestUtilities.serialize(stringsModel);

    Strings stringsModelNew = TestUtilities.deserialize(json, Strings.class);
    assertTrue(stringsModelNew instanceof Strings);
    assertEquals(stringsModelNew.notCreatableMsg(), "testString");
    assertEquals(stringsModelNew.notCreatableRobotMsg(), "testString");
    assertEquals(stringsModelNew.deprecationWarning(), "testString");
    assertEquals(stringsModelNew.popupWarningMessage(), "testString");
    assertEquals(stringsModelNew.instruction(), "testString");
  }
}