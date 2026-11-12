.class public final Loq1;
.super Lq42;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lgf1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lrq1;

.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(Lrq1;ILjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Loq1;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Loq1;->o:Lrq1;

    .line 4
    .line 5
    iput p2, p0, Loq1;->p:I

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lq42;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lrq1;ILjava/util/List;Z)V
    .locals 0

    const/4 p3, 0x0

    iput p3, p0, Loq1;->n:I

    .line 12
    iput-object p1, p0, Loq1;->o:Lrq1;

    iput p2, p0, Loq1;->p:I

    invoke-direct {p0, p3}, Lq42;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Loq1;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Loq1;->o:Lrq1;

    .line 7
    .line 8
    iget-object v0, v0, Lrq1;->x:Lrv2;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Loq1;->o:Lrq1;

    .line 14
    .line 15
    iget p0, p0, Loq1;->p:I

    .line 16
    .line 17
    monitor-enter v0

    .line 18
    :try_start_0
    iget-object v1, v0, Lrq1;->L:Ljava/util/LinkedHashSet;

    .line 19
    .line 20
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-interface {v1, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    monitor-exit v0

    .line 28
    sget-object p0, Lj15;->a:Lj15;

    .line 29
    .line 30
    return-object p0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    monitor-exit v0

    .line 33
    throw p0

    .line 34
    :pswitch_0
    iget-object v0, p0, Loq1;->o:Lrq1;

    .line 35
    .line 36
    iget-object v0, v0, Lrq1;->x:Lrv2;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Loq1;->o:Lrq1;

    .line 42
    .line 43
    iget p0, p0, Loq1;->p:I

    .line 44
    .line 45
    :try_start_1
    iget-object v1, v0, Lrq1;->J:Lzq1;

    .line 46
    .line 47
    sget-object v2, Lb21;->u:Lb21;

    .line 48
    .line 49
    invoke-virtual {v1, p0, v2}, Lzq1;->u(ILb21;)V

    .line 50
    .line 51
    .line 52
    monitor-enter v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 53
    :try_start_2
    iget-object v1, v0, Lrq1;->L:Ljava/util/LinkedHashSet;

    .line 54
    .line 55
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-interface {v1, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 60
    .line 61
    .line 62
    :try_start_3
    monitor-exit v0

    .line 63
    goto :goto_0

    .line 64
    :catchall_1
    move-exception p0

    .line 65
    monitor-exit v0

    .line 66
    throw p0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 67
    :catch_0
    :goto_0
    sget-object p0, Lj15;->a:Lj15;

    .line 68
    .line 69
    return-object p0

    .line 70
    :pswitch_1
    iget-object v0, p0, Loq1;->o:Lrq1;

    .line 71
    .line 72
    iget-object v0, v0, Lrq1;->x:Lrv2;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Loq1;->o:Lrq1;

    .line 78
    .line 79
    iget p0, p0, Loq1;->p:I

    .line 80
    .line 81
    :try_start_4
    iget-object v1, v0, Lrq1;->J:Lzq1;

    .line 82
    .line 83
    sget-object v2, Lb21;->u:Lb21;

    .line 84
    .line 85
    invoke-virtual {v1, p0, v2}, Lzq1;->u(ILb21;)V

    .line 86
    .line 87
    .line 88
    monitor-enter v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 89
    :try_start_5
    iget-object v1, v0, Lrq1;->L:Ljava/util/LinkedHashSet;

    .line 90
    .line 91
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-interface {v1, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 96
    .line 97
    .line 98
    :try_start_6
    monitor-exit v0

    .line 99
    goto :goto_1

    .line 100
    :catchall_2
    move-exception p0

    .line 101
    monitor-exit v0

    .line 102
    throw p0
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1

    .line 103
    :catch_1
    :goto_1
    sget-object p0, Lj15;->a:Lj15;

    .line 104
    .line 105
    return-object p0

    .line 106
    nop

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
