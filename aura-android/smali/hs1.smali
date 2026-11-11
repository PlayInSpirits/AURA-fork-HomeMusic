.class public final Lhs1;
.super Landroid/webkit/WebViewClient;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:Lcom/eddyizm/tempus/homemusic/HubFragment;


# direct methods
.method public constructor <init>(Lcom/eddyizm/tempus/homemusic/HubFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lhs1;->a:Lcom/eddyizm/tempus/homemusic/HubFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final doUpdateVisitedHistory(Landroid/webkit/WebView;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p1, Lcom/eddyizm/tempus/homemusic/HubFragment;->y0:Ljava/util/List;

    .line 5
    .line 6
    invoke-static {p2}, Lxl;->J(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Lhs1;->a:Lcom/eddyizm/tempus/homemusic/HubFragment;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/homemusic/HubFragment;->j0(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "DOCUMENT_START_SCRIPT"

    .line 5
    .line 6
    invoke-static {v0}, Lg12;->C(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const-string v0, "\n(function () {\n  if (window.__HOMEMUSIC_EMBEDDED__) return;\n  window.__HOMEMUSIC_EMBEDDED__ = true;\n  var css = \'nav[aria-label=\"\u0420\u0430\u0437\u0434\u0435\u043b\u044b\"]{display:none!important}\' +\n            \'main{padding-bottom:16px!important}\';\n  function addStyle() {\n    if (document.getElementById(\'hm-embedded-style\')) return;\n    var s = document.createElement(\'style\');\n    s.id = \'hm-embedded-style\';\n    s.textContent = css;\n    (document.head || document.documentElement).appendChild(s);\n    if (document.documentElement) document.documentElement.classList.add(\'hm-embedded\');\n  }\n  if (document.head) addStyle(); else document.addEventListener(\'DOMContentLoaded\', addStyle);\n  window.addEventListener(\'hm:unauthorized\', function () {\n    try { HomeMusicAndroid.onUnauthorized(); } catch (e) {}\n  });\n})();\n"

    .line 14
    .line 15
    invoke-virtual {p1, v0, v1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    sget-object p1, Lcom/eddyizm/tempus/homemusic/HubFragment;->y0:Ljava/util/List;

    .line 19
    .line 20
    iget-object p0, p0, Lhs1;->a:Lcom/eddyizm/tempus/homemusic/HubFragment;

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/homemusic/HubFragment;->m0(Z)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 27
    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    invoke-static {p1}, Lhw;->c(Landroid/app/Activity;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p2}, Lxl;->J(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/homemusic/HubFragment;->j0(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void

    .line 43
    :cond_2
    const-string p0, "activity"

    .line 44
    .line 45
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v1
.end method

.method public final onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string p2, "DOCUMENT_START_SCRIPT"

    .line 5
    .line 6
    invoke-static {p2}, Lg12;->C(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    const-string p2, "\n(function () {\n  if (window.__HOMEMUSIC_EMBEDDED__) return;\n  window.__HOMEMUSIC_EMBEDDED__ = true;\n  var css = \'nav[aria-label=\"\u0420\u0430\u0437\u0434\u0435\u043b\u044b\"]{display:none!important}\' +\n            \'main{padding-bottom:16px!important}\';\n  function addStyle() {\n    if (document.getElementById(\'hm-embedded-style\')) return;\n    var s = document.createElement(\'style\');\n    s.id = \'hm-embedded-style\';\n    s.textContent = css;\n    (document.head || document.documentElement).appendChild(s);\n    if (document.documentElement) document.documentElement.classList.add(\'hm-embedded\');\n  }\n  if (document.head) addStyle(); else document.addEventListener(\'DOMContentLoaded\', addStyle);\n  window.addEventListener(\'hm:unauthorized\', function () {\n    try { HomeMusicAndroid.onUnauthorized(); } catch (e) {}\n  });\n})();\n"

    .line 13
    .line 14
    const/4 p3, 0x0

    .line 15
    invoke-virtual {p1, p2, p3}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    sget-boolean p1, Lxt1;->h:Z

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    sput-boolean p1, Lxt1;->h:Z

    .line 24
    .line 25
    iget-object p0, p0, Lhs1;->a:Lcom/eddyizm/tempus/homemusic/HubFragment;

    .line 26
    .line 27
    sget-object p1, Lcom/eddyizm/tempus/homemusic/HubFragment;->y0:Ljava/util/List;

    .line 28
    .line 29
    const/4 p1, 0x1

    .line 30
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/homemusic/HubFragment;->l0(Z)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public final onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    sget-object p1, Lcom/eddyizm/tempus/homemusic/HubFragment;->y0:Ljava/util/List;

    .line 18
    .line 19
    iget-object p0, p0, Lhs1;->a:Lcom/eddyizm/tempus/homemusic/HubFragment;

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/homemusic/HubFragment;->m0(Z)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    sput-object p1, Lhw;->i:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {}, Lrr1;->m()V

    .line 29
    .line 30
    .line 31
    const p1, 0x7f1301b5

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lkc1;->s(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p3}, Landroid/webkit/WebResourceError;->getDescription()Ljava/lang/CharSequence;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    new-instance p3, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string p1, "\n"

    .line 51
    .line 52
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/homemusic/HubFragment;->k0(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p0, p0, Lhs1;->a:Lcom/eddyizm/tempus/homemusic/HubFragment;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    sget-object p2, Lcom/eddyizm/tempus/homemusic/HubFragment;->y0:Ljava/util/List;

    .line 17
    .line 18
    sget-object p2, Lhw;->i:Ljava/lang/String;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    if-nez p2, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {p2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-static {v1, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {p2}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-static {v1, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_1

    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/net/Uri;->getPort()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-virtual {p2}, Landroid/net/Uri;->getPort()I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    if-ne v1, p2, :cond_1

    .line 67
    .line 68
    return v0

    .line 69
    :cond_1
    :goto_0
    :try_start_0
    new-instance p2, Landroid/content/Intent;

    .line 70
    .line 71
    const-string v1, "android.intent.action.VIEW"

    .line 72
    .line 73
    invoke-direct {p2, v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, p2}, Lkc1;->g0(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :catch_0
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 93
    .line 94
    .line 95
    :goto_1
    const/4 p0, 0x1

    .line 96
    return p0
.end method
