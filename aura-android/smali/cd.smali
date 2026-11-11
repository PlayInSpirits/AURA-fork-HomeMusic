.class public final Lcd;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lcd;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Lcd;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lcd;->o:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lcd;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Throwable;

    .line 7
    .line 8
    iget-object p1, p0, Lcd;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Lll;

    .line 11
    .line 12
    iget-object v1, p1, Lll;->p:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object p0, p0, Lcd;->o:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lcz;

    .line 17
    .line 18
    monitor-enter v1

    .line 19
    :try_start_0
    iget-object p1, p1, Lll;->q:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    monitor-exit v1

    .line 27
    sget-object p0, Lj15;->a:Lj15;

    .line 28
    .line 29
    return-object p0

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    move-object p0, v0

    .line 32
    monitor-exit v1

    .line 33
    throw p0

    .line 34
    :pswitch_0
    move-object v5, p1

    .line 35
    check-cast v5, Lgh4;

    .line 36
    .line 37
    sget-object p1, Ljh4;->c:Ljava/lang/Object;

    .line 38
    .line 39
    monitor-enter p1

    .line 40
    :try_start_1
    sget-wide v3, Ljh4;->e:J

    .line 41
    .line 42
    const-wide/16 v0, 0x1

    .line 43
    .line 44
    add-long/2addr v0, v3

    .line 45
    sput-wide v0, Ljh4;->e:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 46
    .line 47
    monitor-exit p1

    .line 48
    iget-object p1, p0, Lcd;->p:Ljava/lang/Object;

    .line 49
    .line 50
    move-object v6, p1

    .line 51
    check-cast v6, Lif1;

    .line 52
    .line 53
    iget-object p0, p0, Lcd;->o:Ljava/lang/Object;

    .line 54
    .line 55
    move-object v7, p0

    .line 56
    check-cast v7, Lif1;

    .line 57
    .line 58
    new-instance v2, La13;

    .line 59
    .line 60
    invoke-direct/range {v2 .. v7}, La13;-><init>(JLgh4;Lif1;Lif1;)V

    .line 61
    .line 62
    .line 63
    return-object v2

    .line 64
    :catchall_1
    move-exception v0

    .line 65
    move-object p0, v0

    .line 66
    monitor-exit p1

    .line 67
    throw p0

    .line 68
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 69
    .line 70
    iget-object p1, p0, Lcd;->p:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p1, Led;

    .line 73
    .line 74
    iget-object p1, p1, Led;->o:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p1, Landroid/view/Choreographer;

    .line 77
    .line 78
    iget-object p0, p0, Lcd;->o:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p0, Ldd;

    .line 81
    .line 82
    invoke-virtual {p1, p0}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 83
    .line 84
    .line 85
    sget-object p0, Lj15;->a:Lj15;

    .line 86
    .line 87
    return-object p0

    .line 88
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 89
    .line 90
    iget-object p1, p0, Lcd;->p:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p1, Lbd;

    .line 93
    .line 94
    iget-object p0, p0, Lcd;->o:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast p0, Ldd;

    .line 97
    .line 98
    iget-object v1, p1, Lbd;->r:Ljava/lang/Object;

    .line 99
    .line 100
    monitor-enter v1

    .line 101
    :try_start_2
    iget-object p1, p1, Lbd;->t:Ljava/util/ArrayList;

    .line 102
    .line 103
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 104
    .line 105
    .line 106
    monitor-exit v1

    .line 107
    sget-object p0, Lj15;->a:Lj15;

    .line 108
    .line 109
    return-object p0

    .line 110
    :catchall_2
    move-exception v0

    .line 111
    move-object p0, v0

    .line 112
    monitor-exit v1

    .line 113
    throw p0

    .line 114
    nop

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
