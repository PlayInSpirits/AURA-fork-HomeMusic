.class public final Lrd0;
.super Ltz3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:I

.field public final b:Lhu2;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Comparable;


# direct methods
.method public constructor <init>(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lrd0;->a:I

    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lrd0;->c:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p2, p0, Lrd0;->d:Ljava/lang/Comparable;

    .line 13
    .line 14
    :try_start_0
    invoke-static {p3}, Lve5;->a(Ljava/lang/String;)Lhu2;

    .line 15
    .line 16
    .line 17
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    goto :goto_0

    .line 19
    :catch_0
    const/4 p1, 0x0

    .line 20
    :goto_0
    iput-object p1, p0, Lrd0;->b:Lhu2;

    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>(Lge3;Lb71;Lhu2;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lrd0;->a:I

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p3, p0, Lrd0;->b:Lhu2;

    iput-object p2, p0, Lrd0;->c:Ljava/lang/Object;

    iput-object p1, p0, Lrd0;->d:Ljava/lang/Comparable;

    return-void
.end method


# virtual methods
.method public final contentLength()J
    .locals 3

    .line 1
    iget v0, p0, Lrd0;->a:I

    .line 2
    .line 3
    const-wide/16 v1, -0x1

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lrd0;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lb71;

    .line 11
    .line 12
    iget-object p0, p0, Lrd0;->d:Ljava/lang/Comparable;

    .line 13
    .line 14
    check-cast p0, Lge3;

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Lb71;->g(Lge3;)Lxo0;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iget-object p0, p0, Lxo0;->e:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Ljava/lang/Long;

    .line 23
    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 27
    .line 28
    .line 29
    move-result-wide v1

    .line 30
    :cond_0
    :pswitch_0
    return-wide v1

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final contentType()Lhu2;
    .locals 1

    .line 1
    iget v0, p0, Lrd0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lrd0;->b:Lhu2;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    iget-object p0, p0, Lrd0;->b:Lhu2;

    .line 10
    .line 11
    return-object p0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final writeTo(Lew;)V
    .locals 3

    .line 1
    iget v0, p0, Lrd0;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lrd0;->d:Ljava/lang/Comparable;

    .line 4
    .line 5
    iget-object p0, p0, Lrd0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, Lb71;

    .line 14
    .line 15
    check-cast v1, Lge3;

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Lb71;->k(Lge3;)Lej4;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :try_start_0
    invoke-interface {p1, p0}, Lew;->p(Lej4;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 30
    :catchall_1
    move-exception v0

    .line 31
    invoke-static {p0, p1}, Lq05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    throw v0

    .line 35
    :pswitch_0
    check-cast p0, Landroid/content/ContentResolver;

    .line 36
    .line 37
    check-cast v1, Landroid/net/Uri;

    .line 38
    .line 39
    invoke-virtual {p0, v1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-eqz p0, :cond_0

    .line 44
    .line 45
    sget-object v0, Lp83;->a:Ljava/util/logging/Logger;

    .line 46
    .line 47
    new-instance v0, Ltk;

    .line 48
    .line 49
    new-instance v1, Lfu4;

    .line 50
    .line 51
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 52
    .line 53
    .line 54
    const/4 v2, 0x1

    .line 55
    invoke-direct {v0, v2, p0, v1}, Ltk;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :try_start_2
    invoke-interface {p1, v0}, Lew;->p(Lej4;)J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ltk;->close()V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :catchall_2
    move-exception p0

    .line 66
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 67
    :catchall_3
    move-exception p1

    .line 68
    invoke-static {v0, p0}, Lq05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    throw p1

    .line 72
    :cond_0
    const-string p0, "\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u043e\u0442\u043a\u0440\u044b\u0442\u044c \u0444\u0430\u0439\u043b"

    .line 73
    .line 74
    invoke-static {p0}, Lmj0;->i(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    :goto_0
    return-void

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
