.class public final Ldefpackage/y41;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/v11;
.implements Ldefpackage/m51;
.implements Ldefpackage/q51;
.implements Ldefpackage/bi0;
.implements Ldefpackage/ro4;
.implements Ldefpackage/d04;
.implements Ldefpackage/d14;
.implements Ldefpackage/w04;
.implements Ldefpackage/fi1;


# instance fields
.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/y41;->n:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final e(F[F[F)F
    .locals 7

    .line 1
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p0}, Ljava/lang/Math;->signum(F)F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p1, v0}, Ljava/util/Arrays;->binarySearch([FF)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-ltz v2, :cond_0

    .line 14
    .line 15
    aget p0, p2, v2

    .line 16
    .line 17
    mul-float/2addr v1, p0

    .line 18
    return v1

    .line 19
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    neg-int v2, v2

    .line 22
    add-int/lit8 v3, v2, -0x1

    .line 23
    .line 24
    array-length v4, p1

    .line 25
    add-int/lit8 v4, v4, -0x1

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    if-lt v3, v4, :cond_2

    .line 29
    .line 30
    array-length v0, p1

    .line 31
    add-int/lit8 v0, v0, -0x1

    .line 32
    .line 33
    aget v0, p1, v0

    .line 34
    .line 35
    array-length p1, p1

    .line 36
    add-int/lit8 p1, p1, -0x1

    .line 37
    .line 38
    aget p1, p2, p1

    .line 39
    .line 40
    cmpg-float p2, v0, v5

    .line 41
    .line 42
    if-nez p2, :cond_1

    .line 43
    .line 44
    return v5

    .line 45
    :cond_1
    div-float/2addr p1, v0

    .line 46
    mul-float/2addr p1, p0

    .line 47
    return p1

    .line 48
    :cond_2
    const/4 p0, -0x1

    .line 49
    if-ne v3, p0, :cond_3

    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    aget p1, p1, p0

    .line 53
    .line 54
    aget p0, p2, p0

    .line 55
    .line 56
    move p2, p1

    .line 57
    move p1, v5

    .line 58
    move v3, p1

    .line 59
    goto :goto_0

    .line 60
    :cond_3
    aget p0, p1, v3

    .line 61
    .line 62
    aget p1, p1, v2

    .line 63
    .line 64
    aget v3, p2, v3

    .line 65
    .line 66
    aget p2, p2, v2

    .line 67
    .line 68
    move v6, p1

    .line 69
    move p1, p0

    .line 70
    move p0, p2

    .line 71
    move p2, v6

    .line 72
    :goto_0
    cmpg-float v2, p1, p2

    .line 73
    .line 74
    if-nez v2, :cond_4

    .line 75
    .line 76
    move v0, v5

    .line 77
    goto :goto_1

    .line 78
    :cond_4
    sub-float/2addr v0, p1

    .line 79
    sub-float/2addr p2, p1

    .line 80
    div-float/2addr v0, p2

    .line 81
    :goto_1
    const/high16 p1, 0x3f800000    # 1.0f

    .line 82
    .line 83
    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    invoke-static {v5, p1}, Ljava/lang/Math;->max(FF)F

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    sub-float/2addr p0, v3

    .line 92
    mul-float/2addr p0, p1

    .line 93
    add-float/2addr p0, v3

    .line 94
    mul-float/2addr p0, v1

    .line 95
    return p0
.end method

.method public static final h(Ljava/util/List;Ljava/lang/StringBuilder;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    invoke-static {v0, v1}, Ldefpackage/gb;->g0(II)Ldefpackage/j02;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-static {v0, v1}, Ldefpackage/gb;->b0(Ldefpackage/j02;I)Ldefpackage/h02;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget v1, v0, Ldefpackage/h02;->n:I

    .line 16
    .line 17
    iget v2, v0, Ldefpackage/h02;->o:I

    .line 18
    .line 19
    iget v0, v0, Ldefpackage/h02;->p:I

    .line 20
    .line 21
    if-lez v0, :cond_0

    .line 22
    .line 23
    if-le v1, v2, :cond_1

    .line 24
    .line 25
    :cond_0
    if-gez v0, :cond_4

    .line 26
    .line 27
    if-gt v2, v1, :cond_4

    .line 28
    .line 29
    :cond_1
    :goto_0
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Ljava/lang/String;

    .line 34
    .line 35
    add-int/lit8 v4, v1, 0x1

    .line 36
    .line 37
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Ljava/lang/String;

    .line 42
    .line 43
    if-lez v1, :cond_2

    .line 44
    .line 45
    const/16 v5, 0x26

    .line 46
    .line 47
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    :cond_2
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    if-eqz v4, :cond_3

    .line 54
    .line 55
    const/16 v3, 0x3d

    .line 56
    .line 57
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    :cond_3
    if-eq v1, v2, :cond_4

    .line 64
    .line 65
    add-int/2addr v1, v0

    .line 66
    goto :goto_0

    .line 67
    :cond_4
    return-void
.end method

.method public static j(IZ)Ldefpackage/k03;
    .locals 4

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
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const-string v2, "BrowsingClient"

    .line 19
    .line 20
    const-string v3, "getGenres()"

    .line 21
    .line 22
    invoke-static {v2, v3}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    iget-object v2, v1, Ldefpackage/gp3;->p:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v2, Ldefpackage/ov;

    .line 28
    .line 29
    iget-object v1, v1, Ldefpackage/gp3;->o:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Ldefpackage/pn4;

    .line 32
    .line 33
    invoke-virtual {v1}, Ldefpackage/pn4;->f()Ljava/util/HashMap;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {v2, v1}, Ldefpackage/ov;->i(Ljava/util/Map;)Lretrofit2/Call;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    new-instance v2, Ldefpackage/o8;

    .line 42
    .line 43
    invoke-direct {v2, p0, v0, p1}, Ldefpackage/o8;-><init>(ILdefpackage/k03;Z)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v1, v2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 47
    .line 48
    .line 49
    return-object v0
.end method

.method private final k(Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public a(Lcom/bumptech/glide/a;Ldefpackage/s92;Ldefpackage/f04;Landroid/content/Context;)Ldefpackage/c04;
    .locals 0

    .line 1
    new-instance p0, Ldefpackage/oi1;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Ldefpackage/c04;-><init>(Lcom/bumptech/glide/a;Ldefpackage/s92;Ldefpackage/f04;Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public b()S
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public build()Ldefpackage/g04;
    .locals 0

    .line 1
    new-instance p0, Ldefpackage/g04;

    .line 2
    .line 3
    invoke-direct {p0}, Ldefpackage/lq;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public c(Ldefpackage/y10;)Ldefpackage/so4;
    .locals 6

    .line 1
    new-instance v0, Ldefpackage/bf1;

    .line 2
    .line 3
    iget-object p0, p1, Ldefpackage/y10;->d:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v1, p0

    .line 6
    check-cast v1, Landroid/content/Context;

    .line 7
    .line 8
    iget-object p0, p1, Ldefpackage/y10;->e:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v2, p0

    .line 11
    check-cast v2, Ljava/lang/String;

    .line 12
    .line 13
    iget-object p0, p1, Ldefpackage/y10;->f:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v3, p0

    .line 16
    check-cast v3, Ldefpackage/uv;

    .line 17
    .line 18
    iget-boolean v4, p1, Ldefpackage/y10;->b:Z

    .line 19
    .line 20
    iget-boolean v5, p1, Ldefpackage/y10;->c:Z

    .line 21
    .line 22
    invoke-direct/range {v0 .. v5}, Ldefpackage/bf1;-><init>(Landroid/content/Context;Ljava/lang/String;Ldefpackage/uv;ZZ)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public d()[S
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public f(Landroid/content/Context;I)Z
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    new-instance p0, Landroid/content/Intent;

    .line 6
    .line 7
    const-string v0, "android.media.action.OPEN_AUDIO_EFFECT_CONTROL_SESSION"

    .line 8
    .line 9
    invoke-direct {p0, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "android.media.extra.AUDIO_SESSION"

    .line 13
    .line 14
    invoke-virtual {p0, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    const-string v0, "android.media.extra.PACKAGE_NAME"

    .line 26
    .line 27
    invoke-virtual {p0, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    return p0
.end method

.method public g()Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public i(Ljava/lang/Object;Ljava/io/File;Ldefpackage/db3;)Z
    .locals 0

    .line 1
    check-cast p1, Ldefpackage/q04;

    .line 2
    .line 3
    invoke-interface {p1}, Ldefpackage/q04;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldefpackage/vh1;

    .line 8
    .line 9
    :try_start_0
    iget-object p0, p0, Ldefpackage/vh1;->n:Ldefpackage/pd;

    .line 10
    .line 11
    iget-object p0, p0, Ldefpackage/pd;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ldefpackage/bi1;

    .line 14
    .line 15
    iget-object p0, p0, Ldefpackage/bi1;->a:Ldefpackage/vk4;

    .line 16
    .line 17
    iget-object p0, p0, Ldefpackage/vk4;->d:Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0, p2}, Ldefpackage/vw;->d(Ljava/nio/ByteBuffer;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :catch_0
    move-exception p0

    .line 29
    const/4 p1, 0x5

    .line 30
    const-string p2, "GifEncoder"

    .line 31
    .line 32
    invoke-static {p2, p1}, Landroid/util/Ldefpackage/og;->isLoggable(Ljava/lang/String;I)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    const-string p1, "Failed to encode GIF drawable data"

    .line 39
    .line 40
    invoke-static {p2, p1, p0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 41
    .line 42
    .line 43
    :cond_0
    const/4 p0, 0x0

    .line 44
    return p0
.end method

.method public l(Ldefpackage/db3;)I
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public m()Ldefpackage/ci0;
    .locals 1

    .line 1
    new-instance p0, Ldefpackage/t61;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Ldefpackage/kp;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public n(S)Ljava/lang/Integer;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public o(Landroid/content/Context;I)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance p0, Landroid/content/Intent;

    .line 5
    .line 6
    const-string v0, "android.media.action.CLOSE_AUDIO_EFFECT_CONTROL_SESSION"

    .line 7
    .line 8
    invoke-direct {p0, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "android.media.extra.AUDIO_SESSION"

    .line 12
    .line 13
    invoke-virtual {p0, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    const-string v0, "android.media.extra.PACKAGE_NAME"

    .line 25
    .line 26
    invoke-virtual {p0, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public p()V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method public q(Ldefpackage/q04;Ldefpackage/db3;)Ldefpackage/q04;
    .locals 3

    .line 1
    invoke-interface {p1}, Ldefpackage/q04;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ldefpackage/vh1;

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/vh1;->n:Ldefpackage/pd;

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/pd;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ldefpackage/bi1;

    .line 12
    .line 13
    iget-object p0, p0, Ldefpackage/bi1;->a:Ldefpackage/vk4;

    .line 14
    .line 15
    iget-object p0, p0, Ldefpackage/vk4;->d:Ljava/nio/ByteBuffer;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    new-instance p1, Ldefpackage/ld;

    .line 22
    .line 23
    sget-object p2, Ldefpackage/vw;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/nio/Buffer;->isReadOnly()Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-nez p2, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->hasArray()Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_0

    .line 36
    .line 37
    new-instance p2, Ldefpackage/k35;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-virtual {p0}, Ljava/nio/Buffer;->limit()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    invoke-direct {p2, v0, v1, v2}, Ldefpackage/k35;-><init>([BII)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    const/4 p2, 0x0

    .line 56
    :goto_0
    if-eqz p2, :cond_1

    .line 57
    .line 58
    iget v0, p2, Ldefpackage/k35;->a:I

    .line 59
    .line 60
    if-nez v0, :cond_1

    .line 61
    .line 62
    iget v0, p2, Ldefpackage/k35;->b:I

    .line 63
    .line 64
    iget-object p2, p2, Ldefpackage/k35;->c:[B

    .line 65
    .line 66
    array-length p2, p2

    .line 67
    if-ne v0, p2, :cond_1

    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    goto :goto_1

    .line 74
    :cond_1
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p0}, Ljava/nio/Buffer;->limit()I

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    new-array p2, p2, [B

    .line 83
    .line 84
    const/4 v0, 0x0

    .line 85
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 90
    .line 91
    invoke-virtual {p0, p2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 92
    .line 93
    .line 94
    move-object p0, p2

    .line 95
    :goto_1
    invoke-direct {p1, p0}, Ldefpackage/ld;-><init>([B)V

    .line 96
    .line 97
    .line 98
    return-object p1
.end method

.method public setEnabled(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public t(II)Ldefpackage/wv4;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method public v(SS)V
    .locals 0

    .line 1
    return-void
.end method

.method public w(Ldefpackage/m84;)V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method public z(S)Ljava/lang/Short;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method
