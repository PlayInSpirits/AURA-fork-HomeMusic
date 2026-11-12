.class public final Li93;
.super Lrx1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Class;)V
    .locals 1

    .line 121
    const/4 v0, 0x0

    iput v0, p0, Li93;->d:I

    invoke-direct {p0, p1}, Lrx1;-><init>(Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;)V
    .locals 11

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Li93;->d:I

    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1}, Lrx1;-><init>(Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lrx1;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Ldd5;

    .line 13
    .line 14
    invoke-virtual {p4, p2, p3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget-object p3, Ldd5;->y:Ljava/lang/String;

    .line 22
    .line 23
    const-wide/32 v0, 0xdbba0

    .line 24
    .line 25
    .line 26
    cmp-long p4, p1, v0

    .line 27
    .line 28
    const-string v2, "Interval duration lesser than minimum allowed value; Changed to 900000"

    .line 29
    .line 30
    if-gez p4, :cond_0

    .line 31
    .line 32
    invoke-static {}, Lcx;->f()Lcx;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v3, p3, v2}, Lcx;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    if-gez p4, :cond_1

    .line 40
    .line 41
    move-wide v3, v0

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move-wide v3, p1

    .line 44
    :goto_0
    if-gez p4, :cond_2

    .line 45
    .line 46
    move-wide v5, v0

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    move-wide v5, p1

    .line 49
    :goto_1
    cmp-long p1, v3, v0

    .line 50
    .line 51
    if-gez p1, :cond_3

    .line 52
    .line 53
    invoke-static {}, Lcx;->f()Lcx;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-virtual {p2, p3, v2}, Lcx;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :cond_3
    if-gez p1, :cond_4

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_4
    move-wide v0, v3

    .line 64
    :goto_2
    iput-wide v0, p0, Ldd5;->h:J

    .line 65
    .line 66
    const-wide/32 p1, 0x493e0

    .line 67
    .line 68
    .line 69
    cmp-long p1, v5, p1

    .line 70
    .line 71
    if-gez p1, :cond_5

    .line 72
    .line 73
    invoke-static {}, Lcx;->f()Lcx;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    const-string p2, "Flex duration lesser than minimum allowed value; Changed to 300000"

    .line 78
    .line 79
    invoke-virtual {p1, p3, p2}, Lcx;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :cond_5
    iget-wide p1, p0, Ldd5;->h:J

    .line 83
    .line 84
    cmp-long p1, v5, p1

    .line 85
    .line 86
    if-lez p1, :cond_6

    .line 87
    .line 88
    invoke-static {}, Lcx;->f()Lcx;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    new-instance p2, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    const-string p4, "Flex duration greater than interval duration; Changed to "

    .line 95
    .line 96
    invoke-direct {p2, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    invoke-virtual {p1, p3, p2}, Lcx;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    :cond_6
    const-wide/32 v7, 0x493e0

    .line 110
    .line 111
    .line 112
    iget-wide v9, p0, Ldd5;->h:J

    .line 113
    .line 114
    invoke-static/range {v5 .. v10}, Lgb;->n(JJJ)J

    .line 115
    .line 116
    .line 117
    move-result-wide p1

    .line 118
    iput-wide p1, p0, Ldd5;->i:J

    .line 119
    .line 120
    return-void
.end method


# virtual methods
.method public final c()Lbd5;
    .locals 3

    .line 1
    iget v0, p0, Li93;->d:I

    .line 2
    .line 3
    iget-object v1, p0, Lrx1;->c:Ljava/io/Serializable;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lrx1;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ldd5;

    .line 11
    .line 12
    iget-boolean v2, v0, Ldd5;->q:Z

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    new-instance v2, Lkf3;

    .line 17
    .line 18
    iget-object p0, p0, Lrx1;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Ljava/util/UUID;

    .line 21
    .line 22
    check-cast v1, Ljava/util/LinkedHashSet;

    .line 23
    .line 24
    invoke-direct {v2, p0, v0, v1}, Lbd5;-><init>(Ljava/util/UUID;Ldd5;Ljava/util/LinkedHashSet;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-string p0, "PeriodicWorkRequests cannot be expedited"

    .line 29
    .line 30
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    :goto_0
    return-object v2

    .line 35
    :pswitch_0
    new-instance v0, Lj93;

    .line 36
    .line 37
    iget-object v2, p0, Lrx1;->a:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, Ljava/util/UUID;

    .line 40
    .line 41
    iget-object p0, p0, Lrx1;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, Ldd5;

    .line 44
    .line 45
    check-cast v1, Ljava/util/LinkedHashSet;

    .line 46
    .line 47
    invoke-direct {v0, v2, p0, v1}, Lbd5;-><init>(Ljava/util/UUID;Ldd5;Ljava/util/LinkedHashSet;)V

    .line 48
    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
