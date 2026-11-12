.class public abstract Lcom/eddyizm/tempus/homemusic/a;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static a:Ljava/lang/ref/WeakReference;

.field public static b:Lcom/eddyizm/tempus/homemusic/SmartSession;

.field public static c:Lu6;

.field public static d:Z

.field public static final e:Ljava/util/HashMap;

.field public static final f:Lk03;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/eddyizm/tempus/homemusic/a;->a:Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    new-instance v0, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/eddyizm/tempus/homemusic/a;->e:Ljava/util/HashMap;

    .line 15
    .line 16
    new-instance v0, Lk03;

    .line 17
    .line 18
    const-wide/16 v1, 0x0

    .line 19
    .line 20
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-direct {v0, v1}, Lad2;-><init>(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lcom/eddyizm/tempus/homemusic/a;->f:Lk03;

    .line 28
    .line 29
    return-void
.end method

.method public static final a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object v0, Lcom/eddyizm/tempus/homemusic/a;->b:Lcom/eddyizm/tempus/homemusic/SmartSession;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lcom/eddyizm/tempus/homemusic/SmartSession;->isRec(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    const/4 v0, 0x1

    .line 19
    if-ne p1, v0, :cond_1

    .line 20
    .line 21
    new-instance p1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v0, "\u2728 "

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    :cond_1
    :goto_0
    return-object p0
.end method

.method public static b()V
    .locals 14

    .line 1
    sget-object v2, Lcom/eddyizm/tempus/homemusic/a;->b:Lcom/eddyizm/tempus/homemusic/SmartSession;

    .line 2
    .line 3
    if-nez v2, :cond_0

    .line 4
    .line 5
    goto :goto_3

    .line 6
    :cond_0
    invoke-virtual {v2}, Lcom/eddyizm/tempus/homemusic/SmartSession;->getInFlight()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v8, 0x1

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v2, v8}, Lcom/eddyizm/tempus/homemusic/SmartSession;->setAgain(Z)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/a;->h()Lqi3;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v9, 0x0

    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_2
    invoke-static {v0}, Lcom/eddyizm/tempus/homemusic/a;->j(Lqi3;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_3

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_3
    move-object v0, v9

    .line 33
    :goto_0
    if-eqz v0, :cond_4

    .line 34
    .line 35
    sget-object v1, Lcom/eddyizm/tempus/homemusic/a;->b:Lcom/eddyizm/tempus/homemusic/SmartSession;

    .line 36
    .line 37
    if-ne v1, v2, :cond_4

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_4
    :goto_1
    move-object v0, v9

    .line 41
    :goto_2
    if-nez v0, :cond_5

    .line 42
    .line 43
    :goto_3
    return-void

    .line 44
    :cond_5
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/a;->d()V

    .line 45
    .line 46
    .line 47
    sget-object v10, Lcom/eddyizm/tempus/homemusic/SmartPlan;->INSTANCE:Lcom/eddyizm/tempus/homemusic/SmartPlan;

    .line 48
    .line 49
    invoke-static {v0}, Lcom/eddyizm/tempus/homemusic/a;->e(Lqi3;)Ljava/util/ArrayList;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    new-instance v11, Ljava/util/ArrayList;

    .line 54
    .line 55
    const/16 v3, 0xa

    .line 56
    .line 57
    invoke-static {v1, v3}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    invoke-direct {v11, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    const/4 v12, 0x0

    .line 69
    move v4, v12

    .line 70
    :goto_4
    if-ge v4, v3, :cond_6

    .line 71
    .line 72
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    add-int/lit8 v4, v4, 0x1

    .line 77
    .line 78
    check-cast v5, Lgn2;

    .line 79
    .line 80
    new-instance v6, Ls11;

    .line 81
    .line 82
    iget-object v7, v5, Lgn2;->a:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    iget-object v5, v5, Lgn2;->a:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v2, v5}, Lcom/eddyizm/tempus/homemusic/SmartSession;->isRec(Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    invoke-direct {v6, v7, v5}, Ls11;-><init>(Ljava/lang/String;Z)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_6
    invoke-interface {v0}, Lqi3;->o0()I

    .line 101
    .line 102
    .line 103
    move-result v13

    .line 104
    new-instance v0, Lq;

    .line 105
    .line 106
    const/4 v6, 0x0

    .line 107
    const/4 v7, 0x5

    .line 108
    const/4 v1, 0x1

    .line 109
    const-class v3, Lcom/eddyizm/tempus/homemusic/SmartSession;

    .line 110
    .line 111
    const-string v4, "isListed"

    .line 112
    .line 113
    const-string v5, "isListed(Ljava/lang/String;)Z"

    .line 114
    .line 115
    invoke-direct/range {v0 .. v7}, Lq;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v10, v11, v13, v0}, Lcom/eddyizm/tempus/homemusic/SmartPlan;->anchor(Ljava/util/List;ILif1;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    if-eqz v0, :cond_7

    .line 123
    .line 124
    sget-object v1, Lcom/eddyizm/tempus/homemusic/SmartContexts;->INSTANCE:Lcom/eddyizm/tempus/homemusic/SmartContexts;

    .line 125
    .line 126
    invoke-virtual {v1, v0}, Lcom/eddyizm/tempus/homemusic/SmartContexts;->hubId(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v9

    .line 130
    :cond_7
    invoke-virtual {v2, v9}, Lcom/eddyizm/tempus/homemusic/SmartSession;->snapshot(Ljava/lang/String;)Lcom/eddyizm/tempus/homemusic/SmartNextIn;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v2}, Lcom/eddyizm/tempus/homemusic/SmartSession;->getId()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-virtual {v2, v8}, Lcom/eddyizm/tempus/homemusic/SmartSession;->setInFlight(Z)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v12}, Lcom/eddyizm/tempus/homemusic/SmartSession;->setAgain(Z)V

    .line 142
    .line 143
    .line 144
    sget-object v3, Lio1;->a:Ljava/util/concurrent/ExecutorService;

    .line 145
    .line 146
    new-instance v4, Lv6;

    .line 147
    .line 148
    const/16 v5, 0x11

    .line 149
    .line 150
    invoke-direct {v4, v0, v1, v2, v5}, Lv6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 151
    .line 152
    .line 153
    invoke-interface {v3, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 154
    .line 155
    .line 156
    return-void
.end method

.method public static c()V
    .locals 5

    .line 1
    sget-object v0, Lcom/eddyizm/tempus/homemusic/a;->f:Lk03;

    .line 2
    .line 3
    invoke-virtual {v0}, Lad2;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/Long;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-wide/16 v1, 0x0

    .line 17
    .line 18
    :goto_0
    const-wide/16 v3, 0x1

    .line 19
    .line 20
    add-long/2addr v1, v3

    .line 21
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Lad2;->k(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static d()V
    .locals 2

    .line 1
    sget-object v0, Lcom/eddyizm/tempus/homemusic/a;->c:Lu6;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Lio1;->b:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    sput-object v0, Lcom/eddyizm/tempus/homemusic/a;->c:Lu6;

    .line 12
    .line 13
    return-void
.end method

.method public static e(Lqi3;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0}, Lqi3;->Q0()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    invoke-static {v0, v1}, Lgb;->g0(II)Lj02;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    const/16 v2, 0xa

    .line 13
    .line 14
    invoke-static {v0, v2}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lh02;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    move-object v2, v0

    .line 26
    check-cast v2, Li02;

    .line 27
    .line 28
    iget-boolean v2, v2, Li02;->p:Z

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    move-object v2, v0

    .line 33
    check-cast v2, Lb02;

    .line 34
    .line 35
    invoke-virtual {v2}, Lb02;->nextInt()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    invoke-interface {p0, v2}, Lqi3;->Y(I)Lgn2;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    return-object v1
.end method

.method public static f(Lcom/eddyizm/tempus/homemusic/SmartSession;)Ljava/util/Map;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/SmartSession;->getOriginal()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/lang/String;

    .line 20
    .line 21
    sget-object v2, Lrs1;->a:Lrs1;

    .line 22
    .line 23
    sget-object v2, Lcom/eddyizm/tempus/homemusic/SmartContexts;->INSTANCE:Lcom/eddyizm/tempus/homemusic/SmartContexts;

    .line 24
    .line 25
    invoke-virtual {v2, v1}, Lcom/eddyizm/tempus/homemusic/SmartContexts;->mediaId(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    sget-object v2, Lrs1;->o:Ljava/util/Map;

    .line 33
    .line 34
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Lk62;

    .line 39
    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 v1, 0x0

    .line 44
    :goto_0
    if-nez v1, :cond_2

    .line 45
    .line 46
    sget-object p0, Lv01;->n:Lv01;

    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/SmartSession;->recIds()Ljava/util/Set;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, Ljava/lang/Iterable;

    .line 54
    .line 55
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 56
    .line 57
    const/16 v2, 0xa

    .line 58
    .line 59
    invoke-static {p0, v2}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-static {v2}, Llg2;->W(I)I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    const/16 v3, 0x10

    .line 68
    .line 69
    if-ge v2, v3, :cond_3

    .line 70
    .line 71
    move v2, v3

    .line 72
    :cond_3
    invoke-direct {v0, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 73
    .line 74
    .line 75
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_4

    .line 84
    .line 85
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    move-object v3, v2

    .line 90
    check-cast v3, Ljava/lang/String;

    .line 91
    .line 92
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_4
    return-object v0
.end method

.method public static g(Lqi3;)V
    .locals 15

    .line 1
    sget-object v2, Lcom/eddyizm/tempus/homemusic/a;->b:Lcom/eddyizm/tempus/homemusic/SmartSession;

    .line 2
    .line 3
    if-nez v2, :cond_0

    .line 4
    .line 5
    goto/16 :goto_4

    .line 6
    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    sput-object v0, Lcom/eddyizm/tempus/homemusic/a;->b:Lcom/eddyizm/tempus/homemusic/SmartSession;

    .line 9
    .line 10
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/a;->d()V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/a;->c()V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lcom/eddyizm/tempus/homemusic/a;->a:Ljava/lang/ref/WeakReference;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    move-object v8, v0

    .line 23
    check-cast v8, Lao2;

    .line 24
    .line 25
    if-nez v8, :cond_1

    .line 26
    .line 27
    goto/16 :goto_4

    .line 28
    .line 29
    :cond_1
    invoke-static {p0}, Lcom/eddyizm/tempus/homemusic/a;->e(Lqi3;)Ljava/util/ArrayList;

    .line 30
    .line 31
    .line 32
    move-result-object v9

    .line 33
    invoke-interface {p0}, Lqi3;->o0()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-ltz p0, :cond_a

    .line 38
    .line 39
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-ge p0, v0, :cond_a

    .line 44
    .line 45
    add-int/lit8 v10, p0, 0x1

    .line 46
    .line 47
    invoke-static {v9, v10}, Lq40;->u0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v11

    .line 51
    sget-object v12, Lcom/eddyizm/tempus/homemusic/SmartPlan;->INSTANCE:Lcom/eddyizm/tempus/homemusic/SmartPlan;

    .line 52
    .line 53
    new-instance v13, Ljava/util/ArrayList;

    .line 54
    .line 55
    const/16 v14, 0xa

    .line 56
    .line 57
    invoke-static {v9, v14}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    invoke-direct {v13, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    const/4 v1, 0x0

    .line 69
    :goto_0
    if-ge v1, v0, :cond_2

    .line 70
    .line 71
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    add-int/lit8 v1, v1, 0x1

    .line 76
    .line 77
    check-cast v3, Lgn2;

    .line 78
    .line 79
    new-instance v4, Ls11;

    .line 80
    .line 81
    iget-object v5, v3, Lgn2;->a:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    iget-object v3, v3, Lgn2;->a:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {v2, v3}, Lcom/eddyizm/tempus/homemusic/SmartSession;->isRec(Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    invoke-direct {v4, v5, v3}, Ls11;-><init>(Ljava/lang/String;Z)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_2
    new-instance v0, Lq;

    .line 100
    .line 101
    const/4 v6, 0x0

    .line 102
    const/4 v7, 0x4

    .line 103
    const/4 v1, 0x1

    .line 104
    const-class v3, Lcom/eddyizm/tempus/homemusic/SmartSession;

    .line 105
    .line 106
    const-string v4, "isListed"

    .line 107
    .line 108
    const-string v5, "isListed(Ljava/lang/String;)Z"

    .line 109
    .line 110
    invoke-direct/range {v0 .. v7}, Lq;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v12, v13, p0, v0}, Lcom/eddyizm/tempus/homemusic/SmartPlan;->anchor(Ljava/util/List;ILif1;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    sget-object v0, Lcom/eddyizm/tempus/homemusic/SmartPlan;->INSTANCE:Lcom/eddyizm/tempus/homemusic/SmartPlan;

    .line 118
    .line 119
    invoke-virtual {v2}, Lcom/eddyizm/tempus/homemusic/SmartSession;->getOriginal()Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    new-instance v3, Ljava/util/ArrayList;

    .line 124
    .line 125
    invoke-static {v11, v14}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 130
    .line 131
    .line 132
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    if-eqz v5, :cond_3

    .line 141
    .line 142
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    check-cast v5, Lgn2;

    .line 147
    .line 148
    new-instance v6, Ls11;

    .line 149
    .line 150
    iget-object v7, v5, Lgn2;->a:Ljava/lang/String;

    .line 151
    .line 152
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    iget-object v5, v5, Lgn2;->a:Ljava/lang/String;

    .line 156
    .line 157
    invoke-virtual {v2, v5}, Lcom/eddyizm/tempus/homemusic/SmartSession;->isRec(Ljava/lang/String;)Z

    .line 158
    .line 159
    .line 160
    move-result v5

    .line 161
    invoke-direct {v6, v7, v5}, Ls11;-><init>(Ljava/lang/String;Z)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_3
    invoke-virtual {v0, v1, v3, p0}, Lcom/eddyizm/tempus/homemusic/SmartPlan;->restore(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    invoke-static {v11, v14}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    invoke-static {v0}, Llg2;->W(I)I

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    const/16 v1, 0x10

    .line 181
    .line 182
    if-ge v0, v1, :cond_4

    .line 183
    .line 184
    move v0, v1

    .line 185
    :cond_4
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 186
    .line 187
    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 188
    .line 189
    .line 190
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    if-eqz v2, :cond_5

    .line 199
    .line 200
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    move-object v3, v2

    .line 205
    check-cast v3, Lgn2;

    .line 206
    .line 207
    iget-object v3, v3, Lgn2;->a:Ljava/lang/String;

    .line 208
    .line 209
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    goto :goto_2

    .line 213
    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    .line 214
    .line 215
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 216
    .line 217
    .line 218
    new-instance v2, Ljava/util/ArrayList;

    .line 219
    .line 220
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 221
    .line 222
    .line 223
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    if-eqz v3, :cond_8

    .line 232
    .line 233
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    check-cast v3, Ljava/lang/String;

    .line 238
    .line 239
    invoke-virtual {v1, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    check-cast v3, Lgn2;

    .line 244
    .line 245
    if-nez v3, :cond_6

    .line 246
    .line 247
    goto :goto_3

    .line 248
    :cond_6
    invoke-static {v3}, Lgi1;->N(Lgn2;)Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    if-nez v4, :cond_7

    .line 253
    .line 254
    goto :goto_3

    .line 255
    :cond_7
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    goto :goto_3

    .line 262
    :cond_8
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 263
    .line 264
    .line 265
    move-result p0

    .line 266
    if-ge v10, p0, :cond_9

    .line 267
    .line 268
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 269
    .line 270
    .line 271
    move-result p0

    .line 272
    invoke-static {v8, v10, p0}, Lbo2;->k(Lao2;II)V

    .line 273
    .line 274
    .line 275
    :cond_9
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 276
    .line 277
    .line 278
    move-result p0

    .line 279
    if-nez p0, :cond_a

    .line 280
    .line 281
    invoke-static {v8, v10, v0, v2}, Lbo2;->h(Lao2;ILjava/util/List;Ljava/util/List;)V

    .line 282
    .line 283
    .line 284
    :cond_a
    :goto_4
    return-void
.end method

.method public static h()Lqi3;
    .locals 1

    .line 1
    invoke-static {}, Lu52;->c()Lv52;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lv52;->a:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object v0, Lcom/eddyizm/tempus/homemusic/a;->a:Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lao2;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-interface {v0}, Lao2;->b()Lqi3;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0

    .line 25
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 26
    return-object v0
.end method

.method public static i(Lqi3;)Ljava/lang/String;
    .locals 6

    .line 1
    const-string v0, "homemusic_smart_shuffle_in_modes"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Lxa3;->u(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    invoke-static {}, Lcx;->h()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    sget-object v0, Lcom/eddyizm/tempus/homemusic/SmartContexts;->INSTANCE:Lcom/eddyizm/tempus/homemusic/SmartContexts;

    .line 18
    .line 19
    invoke-static {p0}, Lcom/eddyizm/tempus/homemusic/a;->e(Lqi3;)Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    new-instance v1, Ljava/util/ArrayList;

    .line 24
    .line 25
    const/16 v2, 0xa

    .line 26
    .line 27
    invoke-static {p0, v2}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    const/4 v3, 0x0

    .line 39
    :goto_0
    if-ge v3, v2, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    add-int/lit8 v3, v3, 0x1

    .line 46
    .line 47
    check-cast v4, Lgn2;

    .line 48
    .line 49
    sget-object v5, Lrs1;->a:Lrs1;

    .line 50
    .line 51
    iget-object v4, v4, Lgn2;->a:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-static {v4}, Lrs1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/homemusic/SmartContexts;->dominant(Ljava/util/List;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 70
    return-object p0
.end method

.method public static final j(Lqi3;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/eddyizm/tempus/homemusic/a;->b:Lcom/eddyizm/tempus/homemusic/SmartSession;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return v1

    .line 10
    :cond_0
    invoke-interface {p0}, Lqi3;->a()Lgn2;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    iget-object p0, p0, Lgn2;->a:Ljava/lang/String;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 p0, 0x0

    .line 20
    :goto_0
    invoke-virtual {v0, p0}, Lcom/eddyizm/tempus/homemusic/SmartSession;->isRec(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_3

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Lcom/eddyizm/tempus/homemusic/SmartSession;->isOwn(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_2

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    return v1

    .line 34
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 35
    return p0
.end method

.method public static k(Landroid/content/Context;Ljava/lang/String;Ljava/util/ArrayList;Lcom/eddyizm/tempus/homemusic/SmartOut;Ljava/util/List;Ljava/lang/String;I)V
    .locals 17

    .line 1
    move-object/from16 v6, p5

    .line 2
    .line 3
    if-eqz v6, :cond_1

    .line 4
    .line 5
    const/16 v1, 0x14

    .line 6
    .line 7
    move/from16 v7, p6

    .line 8
    .line 9
    if-ge v7, v1, :cond_1

    .line 10
    .line 11
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/a;->h()Lqi3;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v1}, Lqi3;->a()Lgn2;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-object v1, v1, Lgn2;->a:Ljava/lang/String;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x0

    .line 27
    :goto_0
    invoke-static {v1, v6}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    sget-object v8, Lio1;->b:Landroid/os/Handler;

    .line 34
    .line 35
    new-instance v0, Lys1;

    .line 36
    .line 37
    move-object/from16 v1, p0

    .line 38
    .line 39
    move-object/from16 v2, p1

    .line 40
    .line 41
    move-object/from16 v3, p2

    .line 42
    .line 43
    move-object/from16 v4, p3

    .line 44
    .line 45
    move-object/from16 v5, p4

    .line 46
    .line 47
    invoke-direct/range {v0 .. v7}, Lys1;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/ArrayList;Lcom/eddyizm/tempus/homemusic/SmartOut;Ljava/util/List;Ljava/lang/String;I)V

    .line 48
    .line 49
    .line 50
    const-wide/16 v1, 0xfa

    .line 51
    .line 52
    invoke-virtual {v8, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    move-object/from16 v2, p1

    .line 57
    .line 58
    move-object/from16 v5, p4

    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    sput-boolean v1, Lcom/eddyizm/tempus/homemusic/a;->d:Z

    .line 62
    .line 63
    sget-object v3, Lcom/eddyizm/tempus/homemusic/a;->a:Ljava/lang/ref/WeakReference;

    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    check-cast v3, Lao2;

    .line 70
    .line 71
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/a;->h()Lqi3;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-virtual/range {p3 .. p3}, Lcom/eddyizm/tempus/homemusic/SmartOut;->getSessionId()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    if-eqz v6, :cond_2

    .line 80
    .line 81
    invoke-static {v6}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    if-nez v7, :cond_2

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_2
    const/4 v6, 0x0

    .line 89
    :goto_1
    if-eqz v3, :cond_17

    .line 90
    .line 91
    if-eqz v4, :cond_17

    .line 92
    .line 93
    if-nez v6, :cond_3

    .line 94
    .line 95
    goto/16 :goto_c

    .line 96
    .line 97
    :cond_3
    invoke-static {v4}, Lcom/eddyizm/tempus/homemusic/a;->e(Lqi3;)Ljava/util/ArrayList;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    invoke-interface {v4}, Lqi3;->o0()I

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    if-ltz v8, :cond_18

    .line 106
    .line 107
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 108
    .line 109
    .line 110
    move-result v9

    .line 111
    if-ge v8, v9, :cond_18

    .line 112
    .line 113
    sget-object v9, Lcom/eddyizm/tempus/homemusic/SmartContexts;->INSTANCE:Lcom/eddyizm/tempus/homemusic/SmartContexts;

    .line 114
    .line 115
    new-instance v10, Ljava/util/ArrayList;

    .line 116
    .line 117
    const/16 v11, 0xa

    .line 118
    .line 119
    invoke-static {v7, v11}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 120
    .line 121
    .line 122
    move-result v12

    .line 123
    invoke-direct {v10, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 127
    .line 128
    .line 129
    move-result v12

    .line 130
    move v13, v1

    .line 131
    :goto_2
    if-ge v13, v12, :cond_4

    .line 132
    .line 133
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v14

    .line 137
    add-int/lit8 v13, v13, 0x1

    .line 138
    .line 139
    check-cast v14, Lgn2;

    .line 140
    .line 141
    sget-object v15, Lrs1;->a:Lrs1;

    .line 142
    .line 143
    iget-object v14, v14, Lgn2;->a:Ljava/lang/String;

    .line 144
    .line 145
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-static {v14}, Lrs1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v14

    .line 152
    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_4
    invoke-virtual {v9, v10}, Lcom/eddyizm/tempus/homemusic/SmartContexts;->dominant(Ljava/util/List;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v9

    .line 160
    invoke-static {v9, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v9

    .line 164
    if-nez v9, :cond_5

    .line 165
    .line 166
    goto/16 :goto_d

    .line 167
    .line 168
    :cond_5
    invoke-interface {v4, v1}, Lqi3;->s(Z)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    check-cast v1, Lgn2;

    .line 176
    .line 177
    add-int/lit8 v8, v8, 0x1

    .line 178
    .line 179
    invoke-static {v7, v8}, Lq40;->u0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    invoke-static {v4, v11}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 184
    .line 185
    .line 186
    move-result v9

    .line 187
    invoke-static {v9}, Llg2;->W(I)I

    .line 188
    .line 189
    .line 190
    move-result v9

    .line 191
    const/16 v10, 0x10

    .line 192
    .line 193
    if-ge v9, v10, :cond_6

    .line 194
    .line 195
    move v9, v10

    .line 196
    :cond_6
    new-instance v12, Ljava/util/LinkedHashMap;

    .line 197
    .line 198
    invoke-direct {v12, v9}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 199
    .line 200
    .line 201
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object v9

    .line 205
    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result v13

    .line 209
    if-eqz v13, :cond_7

    .line 210
    .line 211
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v13

    .line 215
    move-object v14, v13

    .line 216
    check-cast v14, Lgn2;

    .line 217
    .line 218
    iget-object v14, v14, Lgn2;->a:Ljava/lang/String;

    .line 219
    .line 220
    invoke-interface {v12, v14, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    goto :goto_3

    .line 224
    :cond_7
    new-instance v9, Lcom/eddyizm/tempus/homemusic/SmartSession;

    .line 225
    .line 226
    sget-object v13, Lcom/eddyizm/tempus/homemusic/a;->e:Ljava/util/HashMap;

    .line 227
    .line 228
    invoke-virtual {v13, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v13

    .line 232
    check-cast v13, Ljava/lang/String;

    .line 233
    .line 234
    move-object/from16 v14, p2

    .line 235
    .line 236
    invoke-direct {v9, v6, v2, v13, v14}, Lcom/eddyizm/tempus/homemusic/SmartSession;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 237
    .line 238
    .line 239
    sget-object v2, Lcom/eddyizm/tempus/homemusic/SmartPlan;->INSTANCE:Lcom/eddyizm/tempus/homemusic/SmartPlan;

    .line 240
    .line 241
    new-instance v6, Ljava/util/ArrayList;

    .line 242
    .line 243
    invoke-static {v4, v11}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 244
    .line 245
    .line 246
    move-result v13

    .line 247
    invoke-direct {v6, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 248
    .line 249
    .line 250
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 251
    .line 252
    .line 253
    move-result-object v13

    .line 254
    :goto_4
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 255
    .line 256
    .line 257
    move-result v14

    .line 258
    if-eqz v14, :cond_8

    .line 259
    .line 260
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v14

    .line 264
    check-cast v14, Lgn2;

    .line 265
    .line 266
    iget-object v14, v14, Lgn2;->a:Ljava/lang/String;

    .line 267
    .line 268
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    goto :goto_4

    .line 275
    :cond_8
    invoke-virtual/range {p3 .. p3}, Lcom/eddyizm/tempus/homemusic/SmartOut;->getOwn()Ljava/util/List;

    .line 276
    .line 277
    .line 278
    move-result-object v13

    .line 279
    if-nez v13, :cond_9

    .line 280
    .line 281
    sget-object v13, Lu01;->n:Lu01;

    .line 282
    .line 283
    :cond_9
    new-instance v14, Ljava/util/ArrayList;

    .line 284
    .line 285
    invoke-static {v5, v11}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 286
    .line 287
    .line 288
    move-result v15

    .line 289
    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 290
    .line 291
    .line 292
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 293
    .line 294
    .line 295
    move-result-object v15

    .line 296
    :goto_5
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 297
    .line 298
    .line 299
    move-result v16

    .line 300
    if-eqz v16, :cond_a

    .line 301
    .line 302
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v16

    .line 306
    move-object/from16 v0, v16

    .line 307
    .line 308
    check-cast v0, Ldt1;

    .line 309
    .line 310
    iget-object v0, v0, Ldt1;->a:Lcom/eddyizm/tempus/homemusic/SmartRec;

    .line 311
    .line 312
    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    goto :goto_5

    .line 316
    :cond_a
    iget-object v0, v1, Lgn2;->a:Ljava/lang/String;

    .line 317
    .line 318
    invoke-virtual {v2, v6, v13, v14, v0}, Lcom/eddyizm/tempus/homemusic/SmartPlan;->build(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-static {v5, v11}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    invoke-static {v1}, Llg2;->W(I)I

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    if-ge v1, v10, :cond_b

    .line 331
    .line 332
    move v1, v10

    .line 333
    :cond_b
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 334
    .line 335
    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 336
    .line 337
    .line 338
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 343
    .line 344
    .line 345
    move-result v5

    .line 346
    if-eqz v5, :cond_c

    .line 347
    .line 348
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v5

    .line 352
    move-object v6, v5

    .line 353
    check-cast v6, Ldt1;

    .line 354
    .line 355
    iget-object v6, v6, Ldt1;->a:Lcom/eddyizm/tempus/homemusic/SmartRec;

    .line 356
    .line 357
    invoke-virtual {v6}, Lcom/eddyizm/tempus/homemusic/SmartRec;->getQueueId()Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v6

    .line 361
    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    goto :goto_6

    .line 365
    :cond_c
    new-instance v1, Ljava/util/ArrayList;

    .line 366
    .line 367
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 368
    .line 369
    .line 370
    new-instance v5, Ljava/util/ArrayList;

    .line 371
    .line 372
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 373
    .line 374
    .line 375
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 376
    .line 377
    .line 378
    move-result-object v6

    .line 379
    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 380
    .line 381
    .line 382
    move-result v13

    .line 383
    if-eqz v13, :cond_11

    .line 384
    .line 385
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v13

    .line 389
    check-cast v13, Lgg4;

    .line 390
    .line 391
    iget-object v14, v13, Lgg4;->b:Lcom/eddyizm/tempus/homemusic/SmartRec;

    .line 392
    .line 393
    iget-object v13, v13, Lgg4;->a:Ljava/lang/String;

    .line 394
    .line 395
    if-eqz v14, :cond_d

    .line 396
    .line 397
    invoke-virtual {v2, v13}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v14

    .line 401
    check-cast v14, Ldt1;

    .line 402
    .line 403
    goto :goto_8

    .line 404
    :cond_d
    const/4 v14, 0x0

    .line 405
    :goto_8
    if-eqz v14, :cond_e

    .line 406
    .line 407
    iget-object v13, v14, Ldt1;->b:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 408
    .line 409
    invoke-virtual {v1, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    iget-object v13, v14, Ldt1;->c:Lgn2;

    .line 413
    .line 414
    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    goto :goto_7

    .line 418
    :cond_e
    invoke-virtual {v12, v13}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v13

    .line 422
    check-cast v13, Lgn2;

    .line 423
    .line 424
    if-nez v13, :cond_f

    .line 425
    .line 426
    goto :goto_7

    .line 427
    :cond_f
    invoke-static {v13}, Lgi1;->N(Lgn2;)Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 428
    .line 429
    .line 430
    move-result-object v14

    .line 431
    if-nez v14, :cond_10

    .line 432
    .line 433
    goto :goto_7

    .line 434
    :cond_10
    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    goto :goto_7

    .line 441
    :cond_11
    new-instance v2, Ljava/util/ArrayList;

    .line 442
    .line 443
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 444
    .line 445
    .line 446
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    :cond_12
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 451
    .line 452
    .line 453
    move-result v6

    .line 454
    if-eqz v6, :cond_13

    .line 455
    .line 456
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v6

    .line 460
    check-cast v6, Lgg4;

    .line 461
    .line 462
    iget-object v6, v6, Lgg4;->b:Lcom/eddyizm/tempus/homemusic/SmartRec;

    .line 463
    .line 464
    if-eqz v6, :cond_12

    .line 465
    .line 466
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 467
    .line 468
    .line 469
    goto :goto_9

    .line 470
    :cond_13
    invoke-virtual {v9, v2}, Lcom/eddyizm/tempus/homemusic/SmartSession;->register(Ljava/util/List;)Ljava/util/List;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/a;->d()V

    .line 475
    .line 476
    .line 477
    sput-object v9, Lcom/eddyizm/tempus/homemusic/a;->b:Lcom/eddyizm/tempus/homemusic/SmartSession;

    .line 478
    .line 479
    sget-object v2, Lrs1;->a:Lrs1;

    .line 480
    .line 481
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 482
    .line 483
    invoke-static {v0, v11}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 484
    .line 485
    .line 486
    move-result v6

    .line 487
    invoke-static {v6}, Llg2;->W(I)I

    .line 488
    .line 489
    .line 490
    move-result v6

    .line 491
    if-ge v6, v10, :cond_14

    .line 492
    .line 493
    goto :goto_a

    .line 494
    :cond_14
    move v10, v6

    .line 495
    :goto_a
    invoke-direct {v2, v10}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 496
    .line 497
    .line 498
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 499
    .line 500
    .line 501
    move-result-object v6

    .line 502
    :goto_b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 503
    .line 504
    .line 505
    move-result v10

    .line 506
    if-eqz v10, :cond_15

    .line 507
    .line 508
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v10

    .line 512
    move-object v11, v10

    .line 513
    check-cast v11, Ljava/lang/String;

    .line 514
    .line 515
    invoke-virtual {v9}, Lcom/eddyizm/tempus/homemusic/SmartSession;->getRecContext()Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v11

    .line 519
    invoke-interface {v2, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    goto :goto_b

    .line 523
    :cond_15
    invoke-static {v9}, Lcom/eddyizm/tempus/homemusic/a;->f(Lcom/eddyizm/tempus/homemusic/SmartSession;)Ljava/util/Map;

    .line 524
    .line 525
    .line 526
    move-result-object v6

    .line 527
    invoke-static {v2, v6}, Lrs1;->b(Ljava/util/LinkedHashMap;Ljava/util/Map;)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 531
    .line 532
    .line 533
    move-result v2

    .line 534
    if-ge v8, v2, :cond_16

    .line 535
    .line 536
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 537
    .line 538
    .line 539
    move-result v2

    .line 540
    invoke-static {v3, v8, v2}, Lbo2;->k(Lao2;II)V

    .line 541
    .line 542
    .line 543
    :cond_16
    invoke-static {v3, v8, v1, v5}, Lbo2;->h(Lao2;ILjava/util/List;Ljava/util/List;)V

    .line 544
    .line 545
    .line 546
    invoke-virtual {v9}, Lcom/eddyizm/tempus/homemusic/SmartSession;->getId()Ljava/lang/String;

    .line 547
    .line 548
    .line 549
    move-result-object v2

    .line 550
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 551
    .line 552
    .line 553
    move-result v1

    .line 554
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 555
    .line 556
    .line 557
    move-result v0

    .line 558
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 559
    .line 560
    .line 561
    move-result v3

    .line 562
    new-instance v4, Ljava/lang/StringBuilder;

    .line 563
    .line 564
    const-string v5, "start "

    .line 565
    .line 566
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 567
    .line 568
    .line 569
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 570
    .line 571
    .line 572
    const-string v2, ": "

    .line 573
    .line 574
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 575
    .line 576
    .line 577
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 578
    .line 579
    .line 580
    const-string v1, " entries after the playing one, "

    .line 581
    .line 582
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 586
    .line 587
    .line 588
    const-string v0, " recommendations (was "

    .line 589
    .line 590
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 591
    .line 592
    .line 593
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 594
    .line 595
    .line 596
    const-string v0, ")"

    .line 597
    .line 598
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 599
    .line 600
    .line 601
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    const-string v1, "HubSmart"

    .line 606
    .line 607
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 608
    .line 609
    .line 610
    goto :goto_d

    .line 611
    :cond_17
    :goto_c
    const v0, 0x7f130242

    .line 612
    .line 613
    .line 614
    move-object/from16 v2, p0

    .line 615
    .line 616
    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 617
    .line 618
    .line 619
    move-result-object v0

    .line 620
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 621
    .line 622
    .line 623
    :cond_18
    :goto_d
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/a;->c()V

    .line 624
    .line 625
    .line 626
    return-void
.end method

.method public static l(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 10

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-static {p0, v1}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x0

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lcom/eddyizm/tempus/homemusic/SmartRec;

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Lcom/eddyizm/tempus/homemusic/WaveTrack;->item(Ljava/lang/String;)Lcom/eddyizm/tempus/homemusic/HubTracks$Item;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    sget-object v1, Lms1;->a:Ljava/util/concurrent/ExecutorService;

    .line 38
    .line 39
    invoke-static {v0}, Lms1;->b(Ljava/util/List;)Ljava/util/ArrayList;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v1, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    const/4 v4, 0x0

    .line 53
    move v5, v4

    .line 54
    :goto_1
    if-ge v5, v2, :cond_5

    .line 55
    .line 56
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    add-int/lit8 v5, v5, 0x1

    .line 61
    .line 62
    add-int/lit8 v7, v4, 0x1

    .line 63
    .line 64
    if-ltz v4, :cond_4

    .line 65
    .line 66
    check-cast v6, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 67
    .line 68
    if-nez v6, :cond_1

    .line 69
    .line 70
    :goto_2
    move-object v9, v3

    .line 71
    goto :goto_3

    .line 72
    :cond_1
    invoke-static {v6}, Lgb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    invoke-static {v8}, Lgi1;->M(Ljava/util/List;)Ljava/util/ArrayList;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    invoke-static {v8}, Lq40;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    check-cast v8, Lgn2;

    .line 85
    .line 86
    if-nez v8, :cond_2

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_2
    new-instance v9, Ldt1;

    .line 90
    .line 91
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    check-cast v4, Lcom/eddyizm/tempus/homemusic/SmartRec;

    .line 96
    .line 97
    invoke-direct {v9, v4, v6, v8}, Ldt1;-><init>(Lcom/eddyizm/tempus/homemusic/SmartRec;Lcom/eddyizm/tempus/subsonic/models/Child;Lgn2;)V

    .line 98
    .line 99
    .line 100
    :goto_3
    if-eqz v9, :cond_3

    .line 101
    .line 102
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    :cond_3
    move v4, v7

    .line 106
    goto :goto_1

    .line 107
    :cond_4
    invoke-static {}, Lgb;->c0()V

    .line 108
    .line 109
    .line 110
    throw v3

    .line 111
    :cond_5
    return-object v1
.end method

.method public static final m(Lcom/eddyizm/tempus/ui/activity/MainActivity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Runnable;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_b

    .line 12
    .line 13
    sget-object v0, Lcom/eddyizm/tempus/homemusic/SmartContexts;->INSTANCE:Lcom/eddyizm/tempus/homemusic/SmartContexts;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lcom/eddyizm/tempus/homemusic/SmartContexts;->offered(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_b

    .line 20
    .line 21
    const-string v0, "homemusic_smart_shuffle_in_modes"

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    invoke-static {v0, v1}, Lxa3;->u(Ljava/lang/String;Z)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_b

    .line 29
    .line 30
    const-string v0, "homemusic_smart_shuffle_chosen"

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-static {v0, v2}, Lxa3;->u(Ljava/lang/String;Z)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_b

    .line 38
    .line 39
    invoke-static {}, Lu52;->c()Lv52;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-boolean v0, v0, Lv52;->a:Z

    .line 44
    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    goto/16 :goto_5

    .line 48
    .line 49
    :cond_0
    invoke-static {}, Lcx;->h()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_1

    .line 54
    .line 55
    const p1, 0x7f13023f

    .line 56
    .line 57
    .line 58
    invoke-static {p0, p1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 63
    .line 64
    .line 65
    invoke-interface {p4}, Ljava/lang/Runnable;->run()V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_1
    sget-boolean p4, Lcom/eddyizm/tempus/homemusic/a;->d:Z

    .line 70
    .line 71
    if-eqz p4, :cond_2

    .line 72
    .line 73
    return-void

    .line 74
    :cond_2
    if-eqz p2, :cond_4

    .line 75
    .line 76
    invoke-static {p2}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 77
    .line 78
    .line 79
    move-result p4

    .line 80
    if-eqz p4, :cond_3

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    sget-object p4, Lcom/eddyizm/tempus/homemusic/a;->e:Ljava/util/HashMap;

    .line 84
    .line 85
    invoke-virtual {p4, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    :cond_4
    :goto_0
    sget-object p2, Lku3;->n:Lju3;

    .line 89
    .line 90
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    if-nez p2, :cond_a

    .line 95
    .line 96
    invoke-interface {p3}, Ljava/util/Collection;->size()I

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    sget-object p4, Lku3;->o:Lz1;

    .line 101
    .line 102
    invoke-virtual {p4, p2}, Lz1;->a(I)I

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    check-cast p2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 111
    .line 112
    invoke-static {p2}, Lgb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object p4

    .line 116
    new-instance v0, Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    :cond_5
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    if-eqz v4, :cond_6

    .line 130
    .line 131
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    move-object v5, v4

    .line 136
    check-cast v5, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 137
    .line 138
    if-eq v5, p2, :cond_5

    .line 139
    .line 140
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_6
    invoke-static {v0}, Lq40;->S0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-static {v0}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    .line 149
    .line 150
    .line 151
    invoke-static {p4, v0}, Lq40;->G0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 152
    .line 153
    .line 154
    move-result-object p4

    .line 155
    const/16 v0, 0x1f4

    .line 156
    .line 157
    invoke-static {p4, v0}, Lq40;->L0(Ljava/util/List;I)Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object p4

    .line 161
    invoke-static {v2}, Lud3;->x0(Z)V

    .line 162
    .line 163
    .line 164
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/a;->h()Lqi3;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    if-eqz v0, :cond_7

    .line 169
    .line 170
    invoke-interface {v0, v2}, Lqi3;->s(Z)V

    .line 171
    .line 172
    .line 173
    :cond_7
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->P:Lbl2;

    .line 174
    .line 175
    invoke-static {v0, p4, v2, p1}, Lbo2;->q(Lic2;Ljava/util/List;ILjava/lang/String;)V

    .line 176
    .line 177
    .line 178
    iget-object p4, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 179
    .line 180
    iget-object p4, p4, Lzg5;->n:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast p4, Lau;

    .line 183
    .line 184
    invoke-virtual {p4, v1}, Lau;->d(Z)V

    .line 185
    .line 186
    .line 187
    const-string p4, "liked"

    .line 188
    .line 189
    invoke-virtual {p1, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result p4

    .line 193
    if-eqz p4, :cond_8

    .line 194
    .line 195
    const-string p4, "liked_page"

    .line 196
    .line 197
    :goto_2
    move-object v6, p4

    .line 198
    goto :goto_3

    .line 199
    :cond_8
    const-string p4, "playlist_page"

    .line 200
    .line 201
    goto :goto_2

    .line 202
    :goto_3
    new-instance v4, Ljava/util/ArrayList;

    .line 203
    .line 204
    const/16 p4, 0xa

    .line 205
    .line 206
    invoke-static {p3, p4}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 207
    .line 208
    .line 209
    move-result p4

    .line 210
    invoke-direct {v4, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 211
    .line 212
    .line 213
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 214
    .line 215
    .line 216
    move-result-object p3

    .line 217
    :goto_4
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 218
    .line 219
    .line 220
    move-result p4

    .line 221
    if-eqz p4, :cond_9

    .line 222
    .line 223
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object p4

    .line 227
    check-cast p4, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 228
    .line 229
    sget-object v0, Lcom/eddyizm/tempus/homemusic/SmartContexts;->INSTANCE:Lcom/eddyizm/tempus/homemusic/SmartContexts;

    .line 230
    .line 231
    invoke-virtual {p4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p4

    .line 235
    invoke-virtual {v0, p4}, Lcom/eddyizm/tempus/homemusic/SmartContexts;->hubId(Ljava/lang/String;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p4

    .line 239
    invoke-virtual {v4, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    goto :goto_4

    .line 243
    :cond_9
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v5

    .line 247
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v8

    .line 251
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 252
    .line 253
    .line 254
    move-result-object v7

    .line 255
    const p0, 0x7f130241

    .line 256
    .line 257
    .line 258
    invoke-static {v7, p0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 263
    .line 264
    .line 265
    sput-boolean v1, Lcom/eddyizm/tempus/homemusic/a;->d:Z

    .line 266
    .line 267
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/a;->c()V

    .line 268
    .line 269
    .line 270
    sget-object p0, Lio1;->a:Ljava/util/concurrent/ExecutorService;

    .line 271
    .line 272
    new-instance v2, Lup;

    .line 273
    .line 274
    move-object v3, p1

    .line 275
    invoke-direct/range {v2 .. v8}, Lup;-><init>(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    invoke-interface {p0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 279
    .line 280
    .line 281
    return-void

    .line 282
    :cond_a
    const-string p0, "Collection is empty."

    .line 283
    .line 284
    invoke-static {p0}, Lkf2;->m(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    return-void

    .line 288
    :cond_b
    :goto_5
    invoke-interface {p4}, Ljava/lang/Runnable;->run()V

    .line 289
    .line 290
    .line 291
    return-void
.end method
