.class public final Ldefpackage/qz3;
.super Ldefpackage/tz3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ldefpackage/hu2;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/hu2;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Ldefpackage/qz3;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/qz3;->b:Ldefpackage/hu2;

    .line 4
    .line 5
    iput-object p2, p0, Ldefpackage/qz3;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/qz3;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super {p0}, Ldefpackage/tz3;->contentLength()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    return-wide v0

    .line 11
    :pswitch_1
    iget-object p0, p0, Ldefpackage/qz3;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ldefpackage/yw;

    .line 14
    .line 15
    invoke-virtual {p0}, Ldefpackage/yw;->d()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    int-to-long v0, p0

    .line 20
    return-wide v0

    .line 21
    :pswitch_2
    iget-object p0, p0, Ldefpackage/qz3;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Ljava/io/File;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    return-wide v0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final contentType()Ldefpackage/hu2;
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/qz3;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/qz3;->b:Ldefpackage/hu2;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    iget-object p0, p0, Ldefpackage/qz3;->b:Ldefpackage/hu2;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    iget-object p0, p0, Ldefpackage/qz3;->b:Ldefpackage/hu2;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public isOneShot()Z
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/qz3;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ldefpackage/tz3;->isOneShot()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final writeTo(Ldefpackage/ew;)V
    .locals 3

    .line 1
    iget v0, p0, Ldefpackage/qz3;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, Ldefpackage/qz3;->c:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Ldefpackage/yw;

    .line 13
    .line 14
    invoke-interface {p1, p0}, Ldefpackage/ew;->A(Ldefpackage/yw;)Ldefpackage/ew;

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    new-instance v0, Ljava/io/FileInputStream;

    .line 19
    .line 20
    check-cast p0, Ljava/io/FileDescriptor;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    .line 23
    .line 24
    .line 25
    :try_start_0
    invoke-interface {p1}, Ldefpackage/ew;->a()Ldefpackage/tv;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    sget-object p1, Ldefpackage/p83;->a:Ljava/util/logging/Logger;

    .line 30
    .line 31
    new-instance p1, Ldefpackage/tk;

    .line 32
    .line 33
    new-instance v2, Ldefpackage/fu4;

    .line 34
    .line 35
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-direct {p1, v1, v0, v2}, Ldefpackage/tk;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p1}, Ldefpackage/tv;->p(Ldefpackage/ej4;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :catchall_0
    move-exception p0

    .line 49
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 50
    :catchall_1
    move-exception p1

    .line 51
    invoke-static {v0, p0}, Ldefpackage/q05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :pswitch_1
    check-cast p0, Ljava/io/File;

    .line 56
    .line 57
    sget-object v0, Ldefpackage/p83;->a:Ljava/util/logging/Logger;

    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance v0, Ldefpackage/tk;

    .line 63
    .line 64
    new-instance v2, Ljava/io/FileInputStream;

    .line 65
    .line 66
    invoke-direct {v2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 67
    .line 68
    .line 69
    sget-object p0, Ldefpackage/fu4;->d:Ldefpackage/eu4;

    .line 70
    .line 71
    invoke-direct {v0, v1, v2, p0}, Ldefpackage/tk;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    :try_start_2
    invoke-interface {p1, v0}, Ldefpackage/ew;->p(Ldefpackage/ej4;)J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ldefpackage/tk;->close()V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :catchall_2
    move-exception p0

    .line 82
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 83
    :catchall_3
    move-exception p1

    .line 84
    invoke-static {v0, p0}, Ldefpackage/q05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    throw p1

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
