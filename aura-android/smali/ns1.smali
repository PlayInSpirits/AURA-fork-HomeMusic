.class public final synthetic Lns1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:J


# direct methods
.method public synthetic constructor <init>(IJ)V
    .locals 0

    .line 1
    iput p1, p0, Lns1;->n:I

    .line 2
    .line 3
    iput-wide p2, p0, Lns1;->o:J

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget v0, p0, Lns1;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-wide v2, p0, Lns1;->o:J

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-wide v4, Lu52;->i:J

    .line 10
    .line 11
    cmp-long p0, v4, v2

    .line 12
    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    sget-object p0, Lu52;->b:Lk03;

    .line 16
    .line 17
    invoke-static {}, Lu52;->c()Lv52;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const v2, 0x7f1302d8

    .line 22
    .line 23
    .line 24
    const v3, 0x1ffdfffd

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1, v1, v2, v3}, Lv52;->a(Lv52;IIII)Lv52;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0, v0}, Lad2;->k(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-static {}, Lz52;->b()V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void

    .line 38
    :pswitch_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 39
    .line 40
    .line 41
    move-result-wide v4

    .line 42
    sget-wide v6, Lrs1;->j:J

    .line 43
    .line 44
    cmp-long p0, v6, v2

    .line 45
    .line 46
    if-nez p0, :cond_1

    .line 47
    .line 48
    sget-wide v6, Lrs1;->i:J

    .line 49
    .line 50
    const-wide/high16 v8, -0x8000000000000000L

    .line 51
    .line 52
    cmp-long p0, v6, v8

    .line 53
    .line 54
    if-eqz p0, :cond_1

    .line 55
    .line 56
    sget-wide v6, Lrs1;->i:J

    .line 57
    .line 58
    sub-long v6, v4, v6

    .line 59
    .line 60
    const-wide/16 v8, 0x7530

    .line 61
    .line 62
    cmp-long p0, v6, v8

    .line 63
    .line 64
    if-gez p0, :cond_1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    :try_start_0
    sget-object p0, Lrr1;->a:Lrr1;

    .line 68
    .line 69
    new-instance p0, Lor1;

    .line 70
    .line 71
    const/16 v0, 0x16

    .line 72
    .line 73
    invoke-direct {p0, v0}, Lor1;-><init>(I)V

    .line 74
    .line 75
    .line 76
    new-instance v0, Lk2;

    .line 77
    .line 78
    const/16 v6, 0x18

    .line 79
    .line 80
    invoke-direct {v0, v6, v1}, Lk2;-><init>(IB)V

    .line 81
    .line 82
    .line 83
    invoke-static {p0, v0}, Lrr1;->d(Lif1;Lif1;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    check-cast p0, Lcom/eddyizm/tempus/homemusic/HubFavoriteSnapshot;

    .line 88
    .line 89
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/HubFavoriteSnapshot;->states()Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-static {v2, v3, p0}, Ln61;->i(JLjava/util/List;)V

    .line 94
    .line 95
    .line 96
    sput-wide v4, Lrs1;->i:J

    .line 97
    .line 98
    sput-wide v2, Lrs1;->j:J

    .line 99
    .line 100
    sget-object p0, Lj15;->a:Lj15;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :catchall_0
    move-exception p0

    .line 104
    new-instance v0, Ls14;

    .line 105
    .line 106
    invoke-direct {v0, p0}, Ls14;-><init>(Ljava/lang/Throwable;)V

    .line 107
    .line 108
    .line 109
    move-object p0, v0

    .line 110
    :goto_0
    invoke-static {p0}, Lbb3;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    if-eqz p0, :cond_2

    .line 115
    .line 116
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    const-string v0, "favorite snapshot unavailable: "

    .line 125
    .line 126
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    const-string v0, "HubPlays"

    .line 131
    .line 132
    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    :cond_2
    :goto_1
    return-void

    .line 136
    nop

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
