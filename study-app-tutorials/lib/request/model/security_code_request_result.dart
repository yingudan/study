
import 'package:tutorials/request/model/common/common_result.dart';

class SecurityCodeRequestResult {

  CommonResult common = CommonResult();

  String url = '';

  @override
  String toString() {
    return 'SecurityCodeRequestResult{common: $common, url: $url}';
  }
}
