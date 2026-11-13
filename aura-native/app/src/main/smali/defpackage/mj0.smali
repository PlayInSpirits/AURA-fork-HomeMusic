.class public final synthetic Ldefpackage/mj0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/qc2;
.implements Ldefpackage/rs4;
.implements Ldefpackage/xv2;
.implements Ldefpackage/eg1;
.implements Ldefpackage/dw4;
.implements Ldefpackage/vw0;
.implements Ldefpackage/ry0;
.implements Ldefpackage/r83;


# instance fields
.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 9
    iput p1, p0, Ldefpackage/mj0;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ldefpackage/oe1;)V
    .locals 0

    .line 1
    const/16 p1, 0x16

    .line 2
    .line 3
    iput p1, p0, Ldefpackage/mj0;->n:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic f(ILjava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 14
    .line 15
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p1
.end method

.method public static synthetic g(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw v0
.end method

.method public static synthetic i(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/io/IOException;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    throw v0
.end method

.method public static synthetic j(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    throw v0
.end method

.method public static synthetic k(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/io/FileNotFoundException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-direct {v0, p0}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw v0
.end method

.method public static synthetic l(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw v0
.end method

.method public static synthetic m(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-instance p1, Ljava/io/IOException;

    .line 14
    .line 15
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p1
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 1
    return-void
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget p0, p0, Ldefpackage/mj0;->n:I

    .line 2
    .line 3
    sparse-switch p0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ldefpackage/ln1;

    .line 7
    .line 8
    invoke-virtual {p1}, Ldefpackage/ln1;->v()V

    .line 9
    .line 10
    .line 11
    iget-object p0, p1, Ldefpackage/ln1;->V:Ldefpackage/tv4;

    .line 12
    .line 13
    iget-object p0, p0, Ldefpackage/tv4;->b:Ldefpackage/gy3;

    .line 14
    .line 15
    new-instance p1, Ldefpackage/tb4;

    .line 16
    .line 17
    const/16 v0, 0xa

    .line 18
    .line 19
    invoke-direct {p1, v0}, Ldefpackage/tb4;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1, p0}, Ldefpackage/hw;->P(Ldefpackage/eg1;Ljava/util/List;)Ljava/util/AbstractList;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0}, Ldefpackage/yw1;->k(Ljava/util/Collection;)Ldefpackage/yw1;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :sswitch_0
    check-cast p1, Ldefpackage/pv4;

    .line 32
    .line 33
    return-object p1

    .line 34
    :sswitch_1
    check-cast p1, Ldefpackage/o42;

    .line 35
    .line 36
    new-instance p0, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    iget-object v0, p1, Ldefpackage/o42;->a:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v0, ": "

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-object p1, p1, Ldefpackage/o42;->b:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :sswitch_2
    new-instance p0, Ldefpackage/nj0;

    .line 62
    .line 63
    check-cast p1, Ldefpackage/vp4;

    .line 64
    .line 65
    invoke-direct {p0, p1}, Ldefpackage/nj0;-><init>(Ldefpackage/vp4;)V

    .line 66
    .line 67
    .line 68
    return-object p0

    .line 69
    :sswitch_3
    check-cast p1, Ldefpackage/tv4;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    new-instance p0, Landroid/os/Bundle;

    .line 75
    .line 76
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 77
    .line 78
    .line 79
    sget-object v0, Ldefpackage/tv4;->e:Ljava/lang/String;

    .line 80
    .line 81
    iget-object p1, p1, Ldefpackage/tv4;->b:Ldefpackage/gy3;

    .line 82
    .line 83
    new-instance v1, Ljava/util/ArrayList;

    .line 84
    .line 85
    iget v2, p1, Ldefpackage/gy3;->q:I

    .line 86
    .line 87
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 88
    .line 89
    .line 90
    const/4 v2, 0x0

    .line 91
    invoke-virtual {p1, v2}, Ldefpackage/yw1;->m(I)Ldefpackage/vw1;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    :goto_0
    invoke-virtual {p1}, Ldefpackage/v0;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-eqz v2, :cond_0

    .line 100
    .line 101
    invoke-virtual {p1}, Ldefpackage/v0;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    check-cast v2, Ldefpackage/sv4;

    .line 106
    .line 107
    invoke-virtual {v2}, Ldefpackage/sv4;->d()Landroid/os/Bundle;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_0
    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 116
    .line 117
    .line 118
    return-object p0

    .line 119
    :sswitch_data_0
    .sparse-switch
        0x8 -> :sswitch_3
        0x10 -> :sswitch_2
        0x14 -> :sswitch_1
        0x16 -> :sswitch_0
    .end sparse-switch
.end method

.method public b(F)F
    .locals 0

    .line 1
    return p1
.end method

.method public c()V
    .locals 0

    .line 1
    sget-object p0, Ldefpackage/zs0;->c:Ldefpackage/jn0;

    .line 2
    .line 3
    return-void
.end method

.method public d()Ljava/lang/reflect/Constructor;
    .locals 4

    .line 1
    iget p0, p0, Ldefpackage/mj0;->n:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-class v1, Ldefpackage/k51;

    .line 5
    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    const-string p0, "androidx.media3.decoder.midi.MidiExtractor"

    .line 10
    .line 11
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :pswitch_0
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 25
    .line 26
    const-string v2, "androidx.media3.decoder.flac.FlacLibrary"

    .line 27
    .line 28
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const-string v3, "isAvailable"

    .line 33
    .line 34
    invoke-virtual {v2, v3, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2, v0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {p0, v2}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_0

    .line 47
    .line 48
    const-string p0, "androidx.media3.decoder.flac.FlacExtractor"

    .line 49
    .line 50
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0, v1}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 59
    .line 60
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    :cond_0
    return-object v0

    .line 69
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public e(Ldefpackage/jg0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public h(Ldefpackage/qv2;)V
    .locals 0

    .line 1
    return-void
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget p0, p0, Ldefpackage/mj0;->n:I

    .line 2
    .line 3
    sparse-switch p0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ldefpackage/oi3;

    .line 7
    .line 8
    invoke-interface {p1}, Ldefpackage/oi3;->J()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :sswitch_0
    check-cast p1, Ldefpackage/oi3;

    .line 13
    .line 14
    new-instance p0, Landroidx/media3/exoplayer/ExoTimeoutException;

    .line 15
    .line 16
    const-string v0, "Player release timed out."

    .line 17
    .line 18
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 22
    .line 23
    const/4 v1, 0x2

    .line 24
    const/16 v2, 0x3eb

    .line 25
    .line 26
    invoke-direct {v0, v1, p0, v2}, Landroidx/media3/exoplayer/ExoPlaybackException;-><init>(ILjava/lang/Exception;I)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p1, v0}, Ldefpackage/oi3;->S(Landroidx/media3/common/PlaybackException;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :sswitch_1
    check-cast p1, Ldefpackage/ho2;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :sswitch_2
    check-cast p1, Ldefpackage/ho2;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_2
        0x1 -> :sswitch_1
        0x11 -> :sswitch_0
    .end sparse-switch
.end method

.method public x(Landroid/view/View;Ldefpackage/pb5;)Ldefpackage/pb5;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 p0, 0x20f

    .line 5
    .line 6
    iget-object v0, p2, Ldefpackage/pb5;->a:Ldefpackage/mb5;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ldefpackage/mb5;->h(I)Ldefpackage/vz1;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget v0, p0, Ldefpackage/vz1;->b:I

    .line 16
    .line 17
    iget p0, p0, Ldefpackage/vz1;->d:I

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-virtual {p1, v1, v0, v2, p0}, Landroid/view/View;->setPadding(IIII)V

    .line 28
    .line 29
    .line 30
    return-object p2
.end method
