.class public final Lot1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final b:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lot1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lot1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    return-void
.end method

.method public static final a(Ljava/lang/String;)V
    .locals 4

    .line 1
    const/4 v0, -0x1

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sget-object v1, Lmt1;->n:Lmt1;

    .line 7
    .line 8
    new-instance v1, Lj61;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-direct {v1, v2}, Lj61;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sget-object v2, Lot1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 15
    .line 16
    invoke-virtual {v2, p0, v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    sget-object v0, Lio1;->b:Landroid/os/Handler;

    .line 20
    .line 21
    new-instance v1, Lkt1;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-direct {v1, v2, p0}, Lkt1;-><init>(ILjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-wide/16 v2, 0xfa0

    .line 28
    .line 29
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public static b(Lcom/eddyizm/tempus/homemusic/HubTracks$Item;)Lcom/eddyizm/tempus/subsonic/models/Child;
    .locals 41

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->getRef()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_6

    .line 7
    .line 8
    invoke-static {v0}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v1

    .line 16
    :goto_0
    if-nez v0, :cond_1

    .line 17
    .line 18
    goto/16 :goto_2

    .line 19
    .line 20
    :cond_1
    new-instance v2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 21
    .line 22
    const-string v3, "hub:"

    .line 23
    .line 24
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    const/16 v39, 0x7

    .line 29
    .line 30
    const/16 v40, 0x0

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x0

    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v8, 0x0

    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v10, 0x0

    .line 39
    const/4 v11, 0x0

    .line 40
    const/4 v12, 0x0

    .line 41
    const/4 v13, 0x0

    .line 42
    const/4 v14, 0x0

    .line 43
    const/4 v15, 0x0

    .line 44
    const/16 v16, 0x0

    .line 45
    .line 46
    const/16 v17, 0x0

    .line 47
    .line 48
    const/16 v18, 0x0

    .line 49
    .line 50
    const/16 v19, 0x0

    .line 51
    .line 52
    const/16 v20, 0x0

    .line 53
    .line 54
    const/16 v21, 0x0

    .line 55
    .line 56
    const/16 v22, 0x0

    .line 57
    .line 58
    const/16 v23, 0x0

    .line 59
    .line 60
    const/16 v24, 0x0

    .line 61
    .line 62
    const/16 v25, 0x0

    .line 63
    .line 64
    const/16 v26, 0x0

    .line 65
    .line 66
    const/16 v27, 0x0

    .line 67
    .line 68
    const/16 v28, 0x0

    .line 69
    .line 70
    const/16 v29, 0x0

    .line 71
    .line 72
    const/16 v30, 0x0

    .line 73
    .line 74
    const/16 v31, 0x0

    .line 75
    .line 76
    const/16 v32, 0x0

    .line 77
    .line 78
    const/16 v33, 0x0

    .line 79
    .line 80
    const/16 v34, 0x0

    .line 81
    .line 82
    const/16 v35, 0x0

    .line 83
    .line 84
    const/16 v36, 0x0

    .line 85
    .line 86
    const/16 v37, 0x0

    .line 87
    .line 88
    const/16 v38, -0x2

    .line 89
    .line 90
    invoke-direct/range {v2 .. v40}, Lcom/eddyizm/tempus/subsonic/models/Child;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;Ljava/lang/String;IILxj0;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {p0 .. p0}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->getTitle()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTitle(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual/range {p0 .. p0}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->getArtist()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setArtist(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual/range {p0 .. p0}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->getAlbum()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAlbum(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {p0 .. p0}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->getCoverUrl()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    if-eqz v0, :cond_2

    .line 119
    .line 120
    const-string v3, "http://"

    .line 121
    .line 122
    const/4 v4, 0x0

    .line 123
    invoke-static {v0, v3, v4}, Lxm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    if-nez v3, :cond_3

    .line 128
    .line 129
    const-string v3, "https://"

    .line 130
    .line 131
    invoke-static {v0, v3, v4}, Lxm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    if-eqz v3, :cond_2

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_2
    move-object v0, v1

    .line 139
    :cond_3
    :goto_1
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setCoverArtId(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {p0 .. p0}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->getDurationS()Ljava/lang/Double;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    if-eqz v0, :cond_4

    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 149
    .line 150
    .line 151
    move-result-wide v0

    .line 152
    double-to-int v0, v0

    .line 153
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    :cond_4
    invoke-virtual {v2, v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->setDuration(Ljava/lang/Integer;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    sget-object v1, Lot1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 165
    .line 166
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 171
    .line 172
    if-eqz v0, :cond_5

    .line 173
    .line 174
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getStarred()Ljava/util/Date;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    if-eqz v0, :cond_5

    .line 179
    .line 180
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setStarred(Ljava/util/Date;)V

    .line 181
    .line 182
    .line 183
    :cond_5
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    return-object v2

    .line 191
    :cond_6
    :goto_2
    return-object v1
.end method

.method public static final c(Ljava/lang/String;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    const-string v1, "hub:"

    .line 5
    .line 6
    invoke-static {p0, v1, v0}, Lxm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    const/4 v1, 0x1

    .line 11
    if-ne p0, v1, :cond_0

    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    return v0
.end method

.method public static final d(Landroid/net/Uri;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const-string v0, "homemusic-hub"

    .line 9
    .line 10
    invoke-static {p0, v0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method public static final e(Landroid/content/Context;Lcom/eddyizm/tempus/subsonic/models/Child;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getStarred()Ljava/util/Date;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    move v1, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v1, 0x0

    .line 18
    :goto_0
    invoke-static {v2, v0, v1}, Ln61;->f(ILjava/lang/String;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    xor-int/2addr v0, v2

    .line 23
    invoke-static {p0, p1, v0}, Lot1;->g(Landroid/content/Context;Lcom/eddyizm/tempus/subsonic/models/Child;Z)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public static final f(Landroid/widget/ToggleButton;Ljava/util/function/Supplier;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Llt1;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, p1, v1}, Llt1;-><init>(Landroid/widget/CompoundButton;Ljava/util/function/Supplier;I)V

    .line 8
    .line 9
    .line 10
    new-instance p1, Lbc;

    .line 11
    .line 12
    const/4 v1, 0x4

    .line 13
    invoke-direct {p1, v1, v0}, Lbc;-><init>(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    sget-object p0, Ln61;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->addIfAbsent(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public static g(Landroid/content/Context;Lcom/eddyizm/tempus/subsonic/models/Child;Z)V
    .locals 13

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getStarred()Ljava/util/Date;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    move v1, v2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v1, 0x0

    .line 21
    :goto_0
    invoke-static {v2, v0, v1}, Ln61;->f(ILjava/lang/String;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-ne v5, p2, :cond_1

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    sget-object v1, Lb00;->a:Lb00;

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const-string v0, "hub:"

    .line 35
    .line 36
    invoke-static {p1, v0}, Lqm4;->z0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    const-string p1, "hub:"

    .line 41
    .line 42
    const-string v0, "hub:"

    .line 43
    .line 44
    monitor-enter v1

    .line 45
    :try_start_0
    invoke-static {}, Lb00;->b()Lkd3;

    .line 46
    .line 47
    .line 48
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    if-nez v3, :cond_2

    .line 50
    .line 51
    monitor-exit v1

    .line 52
    goto/16 :goto_2

    .line 53
    .line 54
    :cond_2
    :try_start_1
    iget-object v4, v3, Lkd3;->n:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v4, Ljava/lang/String;

    .line 57
    .line 58
    iget-object v3, v3, Lkd3;->o:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v3, Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v1, v4}, Lb00;->c(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    move v8, v5

    .line 66
    move-object v5, v3

    .line 67
    new-instance v3, Lvz;

    .line 68
    .line 69
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    invoke-virtual {v7}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    sget-object v9, Lcom/eddyizm/tempus/homemusic/PlayEvent;->Companion:Lih3;

    .line 81
    .line 82
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 83
    .line 84
    .line 85
    move-result-wide v10

    .line 86
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-static {v10, v11}, Lih3;->a(J)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v10

    .line 93
    invoke-static {}, Lrs1;->f()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v11

    .line 97
    sget-object v9, Lrs1;->a:Lrs1;

    .line 98
    .line 99
    invoke-virtual {v0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-static {v0}, Lrs1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v12

    .line 107
    move-object v9, v7

    .line 108
    move v7, p2

    .line 109
    invoke-direct/range {v3 .. v12}, Lvz;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 110
    .line 111
    .line 112
    move-object p2, v6

    .line 113
    move v6, v7

    .line 114
    move-object v7, v9

    .line 115
    :try_start_2
    sget-object v0, Lb00;->c:Lrp4;

    .line 116
    .line 117
    invoke-virtual {v0}, Lrp4;->getValue()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    move-object v4, v0

    .line 122
    check-cast v4, Lwz;

    .line 123
    .line 124
    monitor-enter v4
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 125
    :try_start_3
    iget-object v0, v4, Lwz;->c:Ljava/util/List;

    .line 126
    .line 127
    invoke-static {v3, v0}, Lq40;->F0(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v4, v0}, Lwz;->c(Ljava/util/ArrayList;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 132
    .line 133
    .line 134
    :try_start_4
    monitor-exit v4
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 135
    :try_start_5
    sget-object p0, Lb00;->f:Ljava/util/LinkedHashMap;

    .line 136
    .line 137
    new-instance v3, La00;

    .line 138
    .line 139
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    const/4 v9, 0x0

    .line 144
    move v5, v8

    .line 145
    move-object v8, v10

    .line 146
    invoke-direct/range {v3 .. v9}, La00;-><init>(Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Z)V

    .line 147
    .line 148
    .line 149
    invoke-interface {p0, v7, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    const-wide/16 p0, 0x0

    .line 153
    .line 154
    invoke-virtual {v1, p0, p1}, Lb00;->d(J)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 155
    .line 156
    .line 157
    monitor-exit v1

    .line 158
    return-void

    .line 159
    :catchall_0
    move-exception v0

    .line 160
    move-object p0, v0

    .line 161
    goto :goto_3

    .line 162
    :catch_0
    move-exception v0

    .line 163
    move-object p1, v0

    .line 164
    goto :goto_1

    .line 165
    :catchall_1
    move-exception v0

    .line 166
    move-object p1, v0

    .line 167
    :try_start_6
    monitor-exit v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 168
    :try_start_7
    throw p1
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 169
    :goto_1
    :try_start_8
    const-string p2, "CatalogFavorites"

    .line 170
    .line 171
    const-string v0, "save"

    .line 172
    .line 173
    invoke-static {p2, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 174
    .line 175
    .line 176
    monitor-exit v1

    .line 177
    :goto_2
    const-string p1, ""

    .line 178
    .line 179
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    const p2, 0x7f1301b0

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0, p2, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-static {p0, p1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 195
    .line 196
    .line 197
    return-void

    .line 198
    :goto_3
    :try_start_9
    monitor-exit v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 199
    throw p0
.end method

.method public static final h(Ljava/lang/String;)Lcom/eddyizm/tempus/subsonic/models/Child;
    .locals 41

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lot1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-nez v2, :cond_1

    .line 13
    .line 14
    move-object v3, v0

    .line 15
    new-instance v0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 16
    .line 17
    const/16 v37, 0x7

    .line 18
    .line 19
    const/16 v38, 0x0

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    move-object v4, v3

    .line 23
    const/4 v3, 0x0

    .line 24
    move-object v5, v4

    .line 25
    const/4 v4, 0x0

    .line 26
    move-object v6, v5

    .line 27
    const/4 v5, 0x0

    .line 28
    move-object v7, v6

    .line 29
    const/4 v6, 0x0

    .line 30
    move-object v8, v7

    .line 31
    const/4 v7, 0x0

    .line 32
    move-object v9, v8

    .line 33
    const/4 v8, 0x0

    .line 34
    move-object v10, v9

    .line 35
    const/4 v9, 0x0

    .line 36
    move-object v11, v10

    .line 37
    const/4 v10, 0x0

    .line 38
    move-object v12, v11

    .line 39
    const/4 v11, 0x0

    .line 40
    move-object v13, v12

    .line 41
    const/4 v12, 0x0

    .line 42
    move-object v14, v13

    .line 43
    const/4 v13, 0x0

    .line 44
    move-object v15, v14

    .line 45
    const/4 v14, 0x0

    .line 46
    move-object/from16 v16, v15

    .line 47
    .line 48
    const/4 v15, 0x0

    .line 49
    move-object/from16 v17, v16

    .line 50
    .line 51
    const/16 v16, 0x0

    .line 52
    .line 53
    move-object/from16 v18, v17

    .line 54
    .line 55
    const/16 v17, 0x0

    .line 56
    .line 57
    move-object/from16 v19, v18

    .line 58
    .line 59
    const/16 v18, 0x0

    .line 60
    .line 61
    move-object/from16 v20, v19

    .line 62
    .line 63
    const/16 v19, 0x0

    .line 64
    .line 65
    move-object/from16 v21, v20

    .line 66
    .line 67
    const/16 v20, 0x0

    .line 68
    .line 69
    move-object/from16 v22, v21

    .line 70
    .line 71
    const/16 v21, 0x0

    .line 72
    .line 73
    move-object/from16 v23, v22

    .line 74
    .line 75
    const/16 v22, 0x0

    .line 76
    .line 77
    move-object/from16 v24, v23

    .line 78
    .line 79
    const/16 v23, 0x0

    .line 80
    .line 81
    move-object/from16 v25, v24

    .line 82
    .line 83
    const/16 v24, 0x0

    .line 84
    .line 85
    move-object/from16 v26, v25

    .line 86
    .line 87
    const/16 v25, 0x0

    .line 88
    .line 89
    move-object/from16 v27, v26

    .line 90
    .line 91
    const/16 v26, 0x0

    .line 92
    .line 93
    move-object/from16 v28, v27

    .line 94
    .line 95
    const/16 v27, 0x0

    .line 96
    .line 97
    move-object/from16 v29, v28

    .line 98
    .line 99
    const/16 v28, 0x0

    .line 100
    .line 101
    move-object/from16 v30, v29

    .line 102
    .line 103
    const/16 v29, 0x0

    .line 104
    .line 105
    move-object/from16 v31, v30

    .line 106
    .line 107
    const/16 v30, 0x0

    .line 108
    .line 109
    move-object/from16 v32, v31

    .line 110
    .line 111
    const/16 v31, 0x0

    .line 112
    .line 113
    move-object/from16 v33, v32

    .line 114
    .line 115
    const/16 v32, 0x0

    .line 116
    .line 117
    move-object/from16 v34, v33

    .line 118
    .line 119
    const/16 v33, 0x0

    .line 120
    .line 121
    move-object/from16 v35, v34

    .line 122
    .line 123
    const/16 v34, 0x0

    .line 124
    .line 125
    move-object/from16 v36, v35

    .line 126
    .line 127
    const/16 v35, 0x0

    .line 128
    .line 129
    move-object/from16 v39, v36

    .line 130
    .line 131
    const/16 v36, -0x2

    .line 132
    .line 133
    move-object/from16 v40, v39

    .line 134
    .line 135
    invoke-direct/range {v0 .. v38}, Lcom/eddyizm/tempus/subsonic/models/Child;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;Ljava/lang/String;IILxj0;)V

    .line 136
    .line 137
    .line 138
    move-object/from16 v3, v40

    .line 139
    .line 140
    invoke-interface {v3, v1, v0}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    if-nez v1, :cond_0

    .line 145
    .line 146
    move-object v2, v0

    .line 147
    goto :goto_0

    .line 148
    :cond_0
    move-object v2, v1

    .line 149
    :cond_1
    :goto_0
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 150
    .line 151
    return-object v2
.end method

.method public static final i(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lot1;->d(Landroid/net/Uri;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Luo;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-object p1

    .line 22
    :cond_1
    :goto_0
    invoke-static {p0}, Lot1;->d(Landroid/net/Uri;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    const-string v0, "|full-track-v1"

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :cond_2
    invoke-static {}, Ljp1;->a()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const/4 v1, 0x0

    .line 39
    const/4 v2, 0x1

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    :try_start_0
    invoke-static {}, Lcom/eddyizm/tempus/App;->a()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-static {v3}, Lau0;->D(Landroid/content/Context;)Lse4;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v3, p1}, Lse4;->i(Ljava/lang/String;)Lyj0;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-static {v4}, Lnd0;->a(Lnd0;)J

    .line 55
    .line 56
    .line 57
    move-result-wide v4

    .line 58
    const-wide/16 v6, -0x1

    .line 59
    .line 60
    cmp-long v6, v4, v6

    .line 61
    .line 62
    if-eqz v6, :cond_3

    .line 63
    .line 64
    invoke-virtual {v3, p1, v4, v5}, Lse4;->j(Ljava/lang/String;J)Z

    .line 65
    .line 66
    .line 67
    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    if-eqz v3, :cond_3

    .line 69
    .line 70
    move v3, v2

    .line 71
    goto :goto_1

    .line 72
    :catch_0
    :cond_3
    move v3, v1

    .line 73
    :goto_1
    if-eqz v0, :cond_4

    .line 74
    .line 75
    if-nez v3, :cond_4

    .line 76
    .line 77
    move v1, v2

    .line 78
    :cond_4
    invoke-virtual {p0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    new-instance v2, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const-string v4, "variant of "

    .line 85
    .line 86
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string p0, ": economy="

    .line 93
    .line 94
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string p0, " originalCached="

    .line 101
    .line 102
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string p0, " -> light="

    .line 109
    .line 110
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    const-string v0, "HubTracks"

    .line 121
    .line 122
    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 123
    .line 124
    .line 125
    if-eqz v1, :cond_5

    .line 126
    .line 127
    const-string p0, "|mobile"

    .line 128
    .line 129
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    :cond_5
    return-object p1
.end method
