.class public Ldefpackage/xi4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lretrofit2/Callback;
.implements Ldefpackage/l83;
.implements Ldefpackage/px;
.implements Ldefpackage/xn4;
.implements Ldefpackage/zj2;
.implements Ldefpackage/me0;
.implements Ldefpackage/y45;


# static fields
.field public static o:Ldefpackage/xi4;


# instance fields
.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/xi4;->n:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static h(Ldefpackage/xi4;Lretrofit2/Response;Ljava/lang/String;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lretrofit2/Response;->isSuccessful()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_3

    .line 6
    .line 7
    invoke-virtual {p1}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_3

    .line 12
    .line 13
    invoke-virtual {p1}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-string p1, "similarSongs"

    .line 24
    .line 25
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getSimilarSongs()Lcom/eddyizm/tempus/subsonic/models/SimilarSongs;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getSimilarSongs()Lcom/eddyizm/tempus/subsonic/models/SimilarSongs;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/SimilarSongs;->getSongs()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const-string p1, "similarSongs2"

    .line 47
    .line 48
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_1

    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getSimilarSongs2()Lcom/eddyizm/tempus/subsonic/models/SimilarSongs2;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-eqz p1, :cond_1

    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getSimilarSongs2()Lcom/eddyizm/tempus/subsonic/models/SimilarSongs2;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/SimilarSongs2;->getSongs()Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    goto :goto_0

    .line 69
    :cond_1
    const/4 p0, 0x0

    .line 70
    :goto_0
    if-eqz p0, :cond_2

    .line 71
    .line 72
    return-object p0

    .line 73
    :cond_2
    new-instance p0, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 76
    .line 77
    .line 78
    return-object p0

    .line 79
    :cond_3
    new-instance p0, Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 82
    .line 83
    .line 84
    return-object p0
.end method

.method public static final i(IJ)I
    .locals 1

    .line 1
    sget v0, Ldefpackage/e35;->o:I

    .line 2
    .line 3
    mul-int/lit8 p0, p0, 0xf

    .line 4
    .line 5
    shr-long p0, p1, p0

    .line 6
    .line 7
    long-to-int p0, p0

    .line 8
    and-int/lit16 p0, p0, 0x7fff

    .line 9
    .line 10
    return p0
.end method

.method public static j(Lcom/google/android/material/tabs/TabLayout;Landroid/view/View;)Landroid/graphics/RectF;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    new-instance p0, Landroid/graphics/RectF;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/graphics/RectF;-><init>()V

    .line 6
    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    iget-boolean p0, p0, Lcom/google/android/material/tabs/TabLayout;->Q:Z

    .line 10
    .line 11
    if-nez p0, :cond_2

    .line 12
    .line 13
    instance-of p0, p1, Ldefpackage/mq4;

    .line 14
    .line 15
    if-eqz p0, :cond_2

    .line 16
    .line 17
    check-cast p1, Ldefpackage/mq4;

    .line 18
    .line 19
    invoke-virtual {p1}, Ldefpackage/mq4;->getContentWidth()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-virtual {p1}, Ldefpackage/mq4;->getContentHeight()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const/16 v2, 0x18

    .line 32
    .line 33
    invoke-static {v1, v2}, Ldefpackage/vr1;->l(Landroid/content/Context;I)F

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    float-to-int v1, v1

    .line 38
    if-ge p0, v1, :cond_1

    .line 39
    .line 40
    move p0, v1

    .line 41
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    add-int/2addr v2, v1

    .line 50
    div-int/lit8 v2, v2, 0x2

    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    add-int/2addr p1, v1

    .line 61
    div-int/lit8 p1, p1, 0x2

    .line 62
    .line 63
    div-int/lit8 p0, p0, 0x2

    .line 64
    .line 65
    sub-int v1, v2, p0

    .line 66
    .line 67
    div-int/lit8 v0, v0, 0x2

    .line 68
    .line 69
    sub-int v0, p1, v0

    .line 70
    .line 71
    add-int/2addr p0, v2

    .line 72
    div-int/lit8 v2, v2, 0x2

    .line 73
    .line 74
    add-int/2addr v2, p1

    .line 75
    new-instance p1, Landroid/graphics/RectF;

    .line 76
    .line 77
    int-to-float v1, v1

    .line 78
    int-to-float v0, v0

    .line 79
    int-to-float p0, p0

    .line 80
    int-to-float v2, v2

    .line 81
    invoke-direct {p1, v1, v0, p0, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 82
    .line 83
    .line 84
    return-object p1

    .line 85
    :cond_2
    new-instance p0, Landroid/graphics/RectF;

    .line 86
    .line 87
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    int-to-float v0, v0

    .line 92
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    int-to-float v1, v1

    .line 97
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    int-to-float v2, v2

    .line 102
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    int-to-float p1, p1

    .line 107
    invoke-direct {p0, v0, v1, v2, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 108
    .line 109
    .line 110
    return-object p0
.end method

.method public static k(Ldefpackage/ml3;)Landroid/media/MediaCodec;
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/ml3;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/dk2;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/dk2;->a:Ljava/lang/String;

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v1, "createCodec:"

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p0}, Landroid/media/MediaCodec;->createByCodecName(Ljava/lang/String;)Landroid/media/MediaCodec;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 29
    .line 30
    .line 31
    return-object p0
.end method

.method public static m(Ljava/lang/String;)Ldefpackage/mu4;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const v1, 0x4b88569

    .line 9
    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    const v1, 0x4c38896

    .line 14
    .line 15
    .line 16
    if-eq v0, v1, :cond_0

    .line 17
    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :pswitch_0
    const-string v0, "TLSv1.3"

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    sget-object p0, Ldefpackage/mu4;->p:Ldefpackage/mu4;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_1
    const-string v0, "TLSv1.2"

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    sget-object p0, Ldefpackage/mu4;->q:Ldefpackage/mu4;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_2
    const-string v0, "TLSv1.1"

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    sget-object p0, Ldefpackage/mu4;->r:Ldefpackage/mu4;

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_0
    const-string v0, "TLSv1"

    .line 56
    .line 57
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    sget-object p0, Ldefpackage/mu4;->s:Ldefpackage/mu4;

    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_1
    const-string v0, "SSLv3"

    .line 67
    .line 68
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_2

    .line 73
    .line 74
    sget-object p0, Ldefpackage/mu4;->t:Ldefpackage/mu4;

    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_2
    :goto_0
    const-string v0, "Unexpected TLS version: "

    .line 78
    .line 79
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const/4 p0, 0x0

    .line 87
    return-object p0

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch -0x1dfc3f27
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static p(FFFF)Landroid/graphics/Path;
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0, p1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p2, p3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public static q(ILjava/lang/Integer;Ljava/lang/Integer;)Ldefpackage/k03;
    .locals 9

    .line 1
    new-instance v0, Ldefpackage/k03;

    .line 2
    .line 3
    invoke-direct {v0}, Ldefpackage/ad2;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-static {v1}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ldefpackage/pn4;->a()Ldefpackage/xc5;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const-string v2, "BrowsingClient"

    .line 19
    .line 20
    const-string v3, "getRandomSongs()"

    .line 21
    .line 22
    invoke-static {v2, v3}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    iget-object v2, v1, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 26
    .line 27
    move-object v3, v2

    .line 28
    check-cast v3, Ldefpackage/w8;

    .line 29
    .line 30
    iget-object v1, v1, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Ldefpackage/pn4;

    .line 33
    .line 34
    invoke-virtual {v1}, Ldefpackage/pn4;->f()Ljava/util/HashMap;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-static {}, Ldefpackage/ud3;->k()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    move v5, p0

    .line 43
    move-object v6, p1

    .line 44
    move-object v7, p2

    .line 45
    invoke-interface/range {v3 .. v8}, Ldefpackage/w8;->c(Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lretrofit2/Call;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    new-instance p1, Ldefpackage/r8;

    .line 50
    .line 51
    const/4 p2, 0x4

    .line 52
    invoke-direct {p1, v0, p2}, Ldefpackage/r8;-><init>(Ldefpackage/k03;I)V

    .line 53
    .line 54
    .line 55
    invoke-interface {p0, p1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 56
    .line 57
    .line 58
    return-object v0
.end method

.method public static r(Ljava/lang/String;)Ldefpackage/k03;
    .locals 3

    .line 1
    new-instance v0, Ldefpackage/k03;

    .line 2
    .line 3
    invoke-direct {v0}, Ldefpackage/ad2;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-static {v1}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ldefpackage/pn4;->c()Ldefpackage/gp3;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1, p0}, Ldefpackage/gp3;->m(Ljava/lang/String;)Lretrofit2/Call;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance v1, Ldefpackage/ck;

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    invoke-direct {v1, v0, v2}, Ldefpackage/ck;-><init>(Ldefpackage/k03;I)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p0, v1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public static s(IZZ)Ldefpackage/k03;
    .locals 3

    .line 1
    new-instance v0, Ldefpackage/k03;

    .line 2
    .line 3
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ldefpackage/ad2;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    new-instance p2, Ldefpackage/vi4;

    .line 11
    .line 12
    invoke-direct {p2, p0, v0, p1}, Ldefpackage/vi4;-><init>(ILdefpackage/k03;Z)V

    .line 13
    .line 14
    .line 15
    invoke-static {p2}, Ldefpackage/wn1;->a(Ljava/util/function/Consumer;)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    const/4 p2, 0x0

    .line 20
    invoke-static {p2}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {p2}, Ldefpackage/pn4;->a()Ldefpackage/xc5;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-virtual {p2}, Ldefpackage/xc5;->s()Lretrofit2/Call;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    new-instance v1, Ldefpackage/o8;

    .line 33
    .line 34
    const/4 v2, 0x2

    .line 35
    invoke-direct {v1, p1, v0, p0, v2}, Ldefpackage/o8;-><init>(ZLdefpackage/k03;II)V

    .line 36
    .line 37
    .line 38
    invoke-interface {p2, v1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 39
    .line 40
    .line 41
    return-object v0
.end method

.method private final u(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final v(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final w(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final x(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public C(Ldefpackage/tb1;)Ldefpackage/zn4;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string p1, "This SubtitleParser.Factory doesn\'t support any formats."

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public R(Ldefpackage/tb1;)I
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public a(Ldefpackage/ml3;)Ldefpackage/ak2;
    .locals 4

    .line 1
    const/4 p0, 0x0

    .line 2
    :try_start_0
    invoke-static {p1}, Ldefpackage/xi4;->k(Ldefpackage/ml3;)Landroid/media/MediaCodec;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    const-string v0, "configureCodec"

    .line 7
    .line 8
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p1, Ldefpackage/ml3;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Landroid/view/Surface;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object v1, p1, Ldefpackage/ml3;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Ldefpackage/dk2;

    .line 20
    .line 21
    iget-boolean v1, v1, Ldefpackage/dk2;->h:Z

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 26
    .line 27
    const/16 v2, 0x23

    .line 28
    .line 29
    if-lt v1, v2, :cond_0

    .line 30
    .line 31
    const/16 v1, 0x8

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catch_0
    move-exception p1

    .line 35
    goto :goto_1

    .line 36
    :catch_1
    move-exception p1

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    const/4 v1, 0x0

    .line 39
    :goto_0
    iget-object v2, p1, Ldefpackage/ml3;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v2, Landroid/media/MediaFormat;

    .line 42
    .line 43
    iget-object v3, p1, Ldefpackage/ml3;->e:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v3, Landroid/media/MediaCrypto;

    .line 46
    .line 47
    invoke-virtual {p0, v2, v0, v3, v1}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 48
    .line 49
    .line 50
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 51
    .line 52
    .line 53
    const-string v0, "startCodec"

    .line 54
    .line 55
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/media/MediaCodec;->start()V

    .line 59
    .line 60
    .line 61
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 62
    .line 63
    .line 64
    new-instance v0, Ldefpackage/rm3;

    .line 65
    .line 66
    iget-object p1, p1, Ldefpackage/ml3;->f:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p1, Ldefpackage/ns3;

    .line 69
    .line 70
    invoke-direct {v0, p0, p1}, Ldefpackage/rm3;-><init>(Landroid/media/MediaCodec;Ldefpackage/ns3;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    .line 72
    .line 73
    return-object v0

    .line 74
    :goto_1
    if-eqz p0, :cond_1

    .line 75
    .line 76
    invoke-virtual {p0}, Landroid/media/MediaCodec;->release()V

    .line 77
    .line 78
    .line 79
    :cond_1
    throw p1
.end method

.method public b(Ldefpackage/l51;)J
    .locals 0

    .line 1
    const-wide/16 p0, -0x1

    .line 2
    .line 3
    return-wide p0
.end method

.method public c(Landroid/media/MediaExtractor;Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget p0, p0, Ldefpackage/xi4;->n:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p2, Ljava/nio/ByteBuffer;

    .line 7
    .line 8
    new-instance p0, Ldefpackage/x45;

    .line 9
    .line 10
    invoke-direct {p0, p2}, Ldefpackage/x45;-><init>(Ljava/nio/ByteBuffer;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p0}, Landroid/media/MediaExtractor;->setDataSource(Landroid/media/MediaDataSource;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    check-cast p2, Landroid/content/res/AssetFileDescriptor;

    .line 18
    .line 19
    invoke-virtual {p2}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {p2}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    invoke-virtual {p2}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    .line 28
    .line 29
    .line 30
    move-result-wide v4

    .line 31
    move-object v0, p1

    .line 32
    invoke-virtual/range {v0 .. v5}, Landroid/media/MediaExtractor;->setDataSource(Ljava/io/FileDescriptor;JJ)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x1b
        :pswitch_0
    .end packed-switch
.end method

.method public d(Ldefpackage/ii0;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p1, Ldefpackage/ii0;->a:Landroid/net/Uri;

    .line 5
    .line 6
    iget-object p1, p1, Ldefpackage/ii0;->h:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object p1, v0

    .line 23
    :goto_0
    if-eqz p1, :cond_1

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v1, "http"

    .line 34
    .line 35
    invoke-static {p1, v1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    const-string v1, "https"

    .line 42
    .line 43
    invoke-static {p1, v1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-nez p1, :cond_2

    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-static {p0, p1}, Ldefpackage/ot1;->i(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :cond_2
    :try_start_0
    const-string p1, "id"

    .line 62
    .line 63
    invoke-virtual {p0, p1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    goto :goto_1

    .line 68
    :catch_0
    move-exception p1

    .line 69
    const-string v1, "StreamingCacheKeyFactory"

    .line 70
    .line 71
    const-string v2, "Opaque URI, falling back to URL-based cache key"

    .line 72
    .line 73
    invoke-static {v1, v2, p1}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 74
    .line 75
    .line 76
    :goto_1
    if-nez v0, :cond_3

    .line 77
    .line 78
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    return-object p0

    .line 86
    :cond_3
    const-string p1, "maxBitRate"

    .line 87
    .line 88
    invoke-virtual {p0, p1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    const-string v1, ""

    .line 93
    .line 94
    if-nez p1, :cond_4

    .line 95
    .line 96
    move-object p1, v1

    .line 97
    :cond_4
    const-string v2, "format"

    .line 98
    .line 99
    invoke-virtual {p0, v2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    if-nez v2, :cond_5

    .line 104
    .line 105
    move-object v2, v1

    .line 106
    :cond_5
    const-string v3, "timeOffset"

    .line 107
    .line 108
    invoke-virtual {p0, v3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    if-nez v3, :cond_6

    .line 113
    .line 114
    move-object v3, v1

    .line 115
    :cond_6
    invoke-static {}, Ldefpackage/ud3;->E()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    if-nez v4, :cond_7

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_7
    move-object v1, v4

    .line 123
    :goto_2
    new-instance v4, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string v1, "|"

    .line 132
    .line 133
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-static {p0, p1}, Ldefpackage/ot1;->i(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    return-object p0
.end method

.method public e()Ldefpackage/m84;
    .locals 2

    .line 1
    new-instance p0, Ldefpackage/bo;

    .line 2
    .line 3
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0, v1}, Ldefpackage/bo;-><init>(J)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public f(Landroid/media/MediaMetadataRetriever;Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget p0, p0, Ldefpackage/xi4;->n:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p2, Ljava/nio/ByteBuffer;

    .line 7
    .line 8
    new-instance p0, Ldefpackage/x45;

    .line 9
    .line 10
    invoke-direct {p0, p2}, Ldefpackage/x45;-><init>(Ljava/nio/ByteBuffer;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/media/MediaDataSource;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    check-cast p2, Landroid/content/res/AssetFileDescriptor;

    .line 18
    .line 19
    invoke-virtual {p2}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {p2}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    invoke-virtual {p2}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    .line 28
    .line 29
    .line 30
    move-result-wide v4

    .line 31
    move-object v0, p1

    .line 32
    invoke-virtual/range {v0 .. v5}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/io/FileDescriptor;JJ)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x1b
        :pswitch_0
    .end packed-switch
.end method

.method public g(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public l(Ljava/lang/String;Ldefpackage/k03;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {v0}, Ldefpackage/pn4;->c()Ldefpackage/gp3;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v1, "BrowsingClient"

    .line 14
    .line 15
    const-string v2, "getSimilarSongs()"

    .line 16
    .line 17
    invoke-static {v1, v2}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    iget-object v1, v0, Ldefpackage/gp3;->p:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Ldefpackage/ov;

    .line 23
    .line 24
    iget-object v0, v0, Ldefpackage/gp3;->o:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Ldefpackage/pn4;

    .line 27
    .line 28
    invoke-virtual {v0}, Ldefpackage/pn4;->f()Ljava/util/HashMap;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/16 v2, 0x19

    .line 33
    .line 34
    invoke-interface {v1, v0, p1, v2}, Ldefpackage/ov;->g(Ljava/util/Map;Ljava/lang/String;I)Lretrofit2/Call;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    new-instance v0, Ldefpackage/qr2;

    .line 39
    .line 40
    const/16 v1, 0x12

    .line 41
    .line 42
    invoke-direct {v0, v1, p0, p2}, Ldefpackage/qr2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public n(Ldefpackage/tb1;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public o(Ljava/lang/String;Ldefpackage/fb0;I)Ldefpackage/k03;
    .locals 6

    .line 1
    new-instance v2, Ldefpackage/k03;

    .line 2
    .line 3
    new-instance v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {v2, v0}, Ldefpackage/ad2;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance v3, Ljava/util/HashSet;

    .line 12
    .line 13
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ldefpackage/wi4;

    .line 17
    .line 18
    move-object v1, p0

    .line 19
    move-object v5, p1

    .line 20
    move v4, p3

    .line 21
    invoke-direct/range {v0 .. v5}, Ldefpackage/wi4;-><init>(Ldefpackage/xi4;Ldefpackage/k03;Ljava/util/HashSet;ILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    const/4 p1, 0x0

    .line 29
    if-eqz p0, :cond_2

    .line 30
    .line 31
    const/4 p2, 0x1

    .line 32
    if-eq p0, p2, :cond_1

    .line 33
    .line 34
    const/4 p2, 0x2

    .line 35
    if-eq p0, p2, :cond_0

    .line 36
    .line 37
    return-object v2

    .line 38
    :cond_0
    invoke-static {p1}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Ldefpackage/pn4;->c()Ldefpackage/gp3;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0, v5}, Ldefpackage/gp3;->m(Ljava/lang/String;)Lretrofit2/Call;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    new-instance p1, Ldefpackage/rm2;

    .line 51
    .line 52
    const/16 p2, 0x13

    .line 53
    .line 54
    invoke-direct {p1, p2, v0}, Ldefpackage/rm2;-><init>(ILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-interface {p0, p1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 58
    .line 59
    .line 60
    return-object v2

    .line 61
    :cond_1
    invoke-static {p1}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {p0}, Ldefpackage/pn4;->c()Ldefpackage/gp3;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p0, v5}, Ldefpackage/gp3;->e(Ljava/lang/String;)Lretrofit2/Call;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    new-instance p1, Ldefpackage/x7;

    .line 74
    .line 75
    invoke-direct {p1, v4, v0}, Ldefpackage/x7;-><init>(ILdefpackage/wi4;)V

    .line 76
    .line 77
    .line 78
    invoke-interface {p0, p1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 79
    .line 80
    .line 81
    return-object v2

    .line 82
    :cond_2
    invoke-static {p1}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {p0}, Ldefpackage/pn4;->c()Ldefpackage/gp3;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    const-string p1, "BrowsingClient"

    .line 94
    .line 95
    const-string p2, "getSimilarSongs2()"

    .line 96
    .line 97
    invoke-static {p1, p2}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    iget-object p1, p0, Ldefpackage/gp3;->p:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p1, Ldefpackage/ov;

    .line 103
    .line 104
    iget-object p0, p0, Ldefpackage/gp3;->o:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast p0, Ldefpackage/pn4;

    .line 107
    .line 108
    invoke-virtual {p0}, Ldefpackage/pn4;->f()Ljava/util/HashMap;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-interface {p1, p0, v5, v4}, Ldefpackage/ov;->a(Ljava/util/Map;Ljava/lang/String;I)Lretrofit2/Call;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    new-instance p1, Ldefpackage/ue1;

    .line 117
    .line 118
    const/16 p2, 0xd

    .line 119
    .line 120
    invoke-direct {p1, v1, v4, v0, p2}, Ldefpackage/ue1;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 121
    .line 122
    .line 123
    invoke-interface {p0, p1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 124
    .line 125
    .line 126
    return-object v2
.end method

.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/xi4;->n:I

    .line 2
    .line 3
    return-void
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/xi4;->n:I

    .line 2
    .line 3
    return-void
.end method

.method public t(Ljava/lang/CharSequence;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/xi4;->n:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :sswitch_0
    const-string p0, "ReusedSlotId"

    .line 12
    .line 13
    return-object p0

    .line 14
    :sswitch_1
    const-string p0, "SharingStarted.Lazily"

    .line 15
    .line 16
    return-object p0

    .line 17
    :sswitch_2
    const-string p0, "SharingStarted.Eagerly"

    .line 18
    .line 19
    return-object p0

    .line 20
    nop

    .line 21
    :sswitch_data_0
    .sparse-switch
        0x6 -> :sswitch_2
        0x7 -> :sswitch_1
        0xb -> :sswitch_0
    .end sparse-switch
.end method

.method public y(Lcom/google/android/material/tabs/TabLayout;Landroid/view/View;Landroid/view/View;FLandroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Ldefpackage/xi4;->j(Lcom/google/android/material/tabs/TabLayout;Landroid/view/View;)Landroid/graphics/RectF;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p1, p3}, Ldefpackage/xi4;->j(Lcom/google/android/material/tabs/TabLayout;Landroid/view/View;)Landroid/graphics/RectF;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget p2, p0, Landroid/graphics/RectF;->left:F

    .line 10
    .line 11
    float-to-int p2, p2

    .line 12
    iget p3, p1, Landroid/graphics/RectF;->left:F

    .line 13
    .line 14
    float-to-int p3, p3

    .line 15
    invoke-static {p2, p4, p3}, Ldefpackage/yd;->c(IFI)I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    invoke-virtual {p5}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    iget p3, p3, Landroid/graphics/Rect;->top:I

    .line 24
    .line 25
    iget p0, p0, Landroid/graphics/RectF;->right:F

    .line 26
    .line 27
    float-to-int p0, p0

    .line 28
    iget p1, p1, Landroid/graphics/RectF;->right:F

    .line 29
    .line 30
    float-to-int p1, p1

    .line 31
    invoke-static {p0, p4, p1}, Ldefpackage/yd;->c(IFI)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    invoke-virtual {p5}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 40
    .line 41
    invoke-virtual {p5, p2, p3, p0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 42
    .line 43
    .line 44
    return-void
.end method
