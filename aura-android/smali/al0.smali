.class public final Lal0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lhd2;


# static fields
.field public static final B:Lmj0;


# instance fields
.field public A:J

.field public final n:Lzh0;

.field public final o:Lfn1;

.field public final p:Li80;

.field public final q:Ljava/util/HashMap;

.field public final r:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public s:Lue1;

.field public t:Li61;

.field public u:Landroid/os/Handler;

.field public v:Lzm1;

.field public w:Lcn1;

.field public x:Landroid/net/Uri;

.field public y:Lym1;

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lmj0;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, Lmj0;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lal0;->B:Lmj0;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lzh0;Li80;Lfn1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lal0;->n:Lzh0;

    .line 5
    .line 6
    iput-object p3, p0, Lal0;->o:Lfn1;

    .line 7
    .line 8
    iput-object p2, p0, Lal0;->p:Li80;

    .line 9
    .line 10
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lal0;->r:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 16
    .line 17
    new-instance p1, Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lal0;->q:Ljava/util/HashMap;

    .line 23
    .line 24
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    iput-wide p1, p0, Lal0;->A:J

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final a(ZLandroid/net/Uri;)Lym1;
    .locals 4

    .line 1
    iget-object v0, p0, Lal0;->q:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lzk0;

    .line 8
    .line 9
    iget-object v1, v1, Lzk0;->q:Lym1;

    .line 10
    .line 11
    if-eqz v1, :cond_5

    .line 12
    .line 13
    if-eqz p1, :cond_5

    .line 14
    .line 15
    iget-object p1, p0, Lal0;->x:Landroid/net/Uri;

    .line 16
    .line 17
    invoke-virtual {p2, p1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    iget-object p1, p0, Lal0;->w:Lcn1;

    .line 24
    .line 25
    iget-object p1, p1, Lcn1;->e:Ljava/util/List;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-ge v2, v3, :cond_3

    .line 33
    .line 34
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Lbn1;

    .line 39
    .line 40
    iget-object v3, v3, Lbn1;->a:Landroid/net/Uri;

    .line 41
    .line 42
    invoke-virtual {p2, v3}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    iget-object p1, p0, Lal0;->y:Lym1;

    .line 49
    .line 50
    if-eqz p1, :cond_0

    .line 51
    .line 52
    iget-boolean p1, p1, Lym1;->o:Z

    .line 53
    .line 54
    if-eqz p1, :cond_0

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    iput-object p2, p0, Lal0;->x:Landroid/net/Uri;

    .line 58
    .line 59
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Lzk0;

    .line 64
    .line 65
    iget-object v2, p1, Lzk0;->q:Lym1;

    .line 66
    .line 67
    if-eqz v2, :cond_1

    .line 68
    .line 69
    iget-boolean v3, v2, Lym1;->o:Z

    .line 70
    .line 71
    if-eqz v3, :cond_1

    .line 72
    .line 73
    iput-object v2, p0, Lal0;->y:Lym1;

    .line 74
    .line 75
    iget-object p0, p0, Lal0;->v:Lzm1;

    .line 76
    .line 77
    invoke-virtual {p0, v2}, Lzm1;->u(Lym1;)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    invoke-virtual {p0, p2}, Lal0;->c(Landroid/net/Uri;)Landroid/net/Uri;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p1, p0}, Lzk0;->f(Landroid/net/Uri;)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_3
    :goto_1
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    check-cast p0, Lzk0;

    .line 97
    .line 98
    iget-object p1, p0, Lzk0;->q:Lym1;

    .line 99
    .line 100
    iget-boolean p2, p0, Lzk0;->x:Z

    .line 101
    .line 102
    if-eqz p2, :cond_4

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_4
    const/4 p2, 0x1

    .line 106
    iput-boolean p2, p0, Lzk0;->x:Z

    .line 107
    .line 108
    if-eqz p1, :cond_5

    .line 109
    .line 110
    iget-boolean p1, p1, Lym1;->o:Z

    .line 111
    .line 112
    if-nez p1, :cond_5

    .line 113
    .line 114
    invoke-virtual {p0, p2}, Lzk0;->d(Z)V

    .line 115
    .line 116
    .line 117
    :cond_5
    :goto_2
    return-object v1
.end method

.method public final b(Ljd2;JJZ)V
    .locals 11

    .line 1
    check-cast p1, Lde3;

    .line 2
    .line 3
    new-instance v0, Led2;

    .line 4
    .line 5
    iget-wide v1, p1, Lde3;->a:J

    .line 6
    .line 7
    iget-object v1, p1, Lde3;->b:Lii0;

    .line 8
    .line 9
    iget-object p1, p1, Lde3;->d:Lyl4;

    .line 10
    .line 11
    iget-object v2, p1, Lyl4;->p:Landroid/net/Uri;

    .line 12
    .line 13
    iget-object v3, p1, Lyl4;->q:Ljava/util/Map;

    .line 14
    .line 15
    iget-wide v8, p1, Lyl4;->o:J

    .line 16
    .line 17
    move-wide v4, p2

    .line 18
    move-wide v6, p4

    .line 19
    invoke-direct/range {v0 .. v9}, Led2;-><init>(Lii0;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lal0;->p:Li80;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, Lal0;->s:Lue1;

    .line 28
    .line 29
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    const/4 v2, 0x4

    .line 40
    const/4 v3, -0x1

    .line 41
    const/4 v4, 0x0

    .line 42
    const/4 v5, 0x0

    .line 43
    const/4 v6, 0x0

    .line 44
    move-object v1, v0

    .line 45
    move-object v0, p0

    .line 46
    invoke-virtual/range {v0 .. v10}, Lue1;->q(Led2;IILtb1;ILjava/lang/Object;JJ)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final c(Landroid/net/Uri;)Landroid/net/Uri;
    .locals 2

    .line 1
    iget-object p0, p0, Lal0;->y:Lym1;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lym1;->v:Lxm1;

    .line 6
    .line 7
    iget-boolean v0, v0, Lxm1;->e:Z

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object p0, p0, Lym1;->t:Lbx1;

    .line 12
    .line 13
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lum1;

    .line 18
    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-wide v0, p0, Lum1;->b:J

    .line 26
    .line 27
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "_HLS_msn"

    .line 32
    .line 33
    invoke-virtual {p1, v1, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 34
    .line 35
    .line 36
    iget p0, p0, Lum1;->c:I

    .line 37
    .line 38
    const/4 v0, -0x1

    .line 39
    if-eq p0, v0, :cond_0

    .line 40
    .line 41
    const-string v0, "_HLS_part"

    .line 42
    .line 43
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p1, v0, p0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 48
    .line 49
    .line 50
    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :cond_1
    return-object p1
.end method

.method public final d(Landroid/net/Uri;)Z
    .locals 6

    .line 1
    iget-object p0, p0, Lal0;->q:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lzk0;

    .line 8
    .line 9
    iget-object p1, p0, Lzk0;->q:Lym1;

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    iget-object p1, p0, Lzk0;->q:Lym1;

    .line 19
    .line 20
    iget-wide v2, p1, Lym1;->u:J

    .line 21
    .line 22
    invoke-static {v2, v3}, Lf35;->i0(J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    const-wide/16 v4, 0x7530

    .line 27
    .line 28
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    iget-object p1, p0, Lzk0;->q:Lym1;

    .line 33
    .line 34
    iget-boolean v4, p1, Lym1;->o:Z

    .line 35
    .line 36
    const/4 v5, 0x1

    .line 37
    if-nez v4, :cond_2

    .line 38
    .line 39
    iget p1, p1, Lym1;->d:I

    .line 40
    .line 41
    const/4 v4, 0x2

    .line 42
    if-eq p1, v4, :cond_2

    .line 43
    .line 44
    if-eq p1, v5, :cond_2

    .line 45
    .line 46
    iget-wide p0, p0, Lzk0;->r:J

    .line 47
    .line 48
    add-long/2addr p0, v2

    .line 49
    cmp-long p0, p0, v0

    .line 50
    .line 51
    if-lez p0, :cond_1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 55
    return p0

    .line 56
    :cond_2
    :goto_1
    return v5
.end method

.method public final g(Ljd2;JJ)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lde3;

    .line 6
    .line 7
    iget-object v2, v1, Lde3;->f:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ldn1;

    .line 10
    .line 11
    instance-of v3, v2, Lym1;

    .line 12
    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    iget-object v4, v2, Ldn1;->a:Ljava/lang/String;

    .line 16
    .line 17
    sget-object v5, Lcn1;->l:Lcn1;

    .line 18
    .line 19
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    new-instance v4, Lsb1;

    .line 24
    .line 25
    invoke-direct {v4}, Lsb1;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v5, "0"

    .line 29
    .line 30
    iput-object v5, v4, Lsb1;->a:Ljava/lang/String;

    .line 31
    .line 32
    const-string v5, "application/x-mpegURL"

    .line 33
    .line 34
    invoke-static {v5}, Llw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    iput-object v5, v4, Lsb1;->l:Ljava/lang/String;

    .line 39
    .line 40
    new-instance v8, Ltb1;

    .line 41
    .line 42
    invoke-direct {v8, v4}, Ltb1;-><init>(Lsb1;)V

    .line 43
    .line 44
    .line 45
    new-instance v6, Lbn1;

    .line 46
    .line 47
    const/4 v11, 0x0

    .line 48
    const/4 v12, 0x0

    .line 49
    const/4 v9, 0x0

    .line 50
    const/4 v10, 0x0

    .line 51
    invoke-direct/range {v6 .. v12}, Lbn1;-><init>(Landroid/net/Uri;Ltb1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v6}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v10

    .line 58
    new-instance v7, Lcn1;

    .line 59
    .line 60
    sget-object v9, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 61
    .line 62
    const/16 v17, 0x0

    .line 63
    .line 64
    sget-object v18, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 65
    .line 66
    const-string v8, ""

    .line 67
    .line 68
    const/4 v15, 0x0

    .line 69
    const/16 v16, 0x0

    .line 70
    .line 71
    move-object v11, v9

    .line 72
    move-object v12, v9

    .line 73
    move-object v13, v9

    .line 74
    move-object v14, v9

    .line 75
    move-object/from16 v19, v9

    .line 76
    .line 77
    invoke-direct/range {v7 .. v19}, Lcn1;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ltb1;Ljava/util/List;ZLjava/util/Map;Ljava/util/List;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    move-object v7, v2

    .line 82
    check-cast v7, Lcn1;

    .line 83
    .line 84
    :goto_0
    iput-object v7, v0, Lal0;->w:Lcn1;

    .line 85
    .line 86
    iget-object v4, v7, Lcn1;->e:Ljava/util/List;

    .line 87
    .line 88
    const/4 v5, 0x0

    .line 89
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    check-cast v4, Lbn1;

    .line 94
    .line 95
    iget-object v4, v4, Lbn1;->a:Landroid/net/Uri;

    .line 96
    .line 97
    iput-object v4, v0, Lal0;->x:Landroid/net/Uri;

    .line 98
    .line 99
    iget-object v4, v0, Lal0;->r:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 100
    .line 101
    new-instance v6, Lyk0;

    .line 102
    .line 103
    invoke-direct {v6, v0}, Lyk0;-><init>(Lal0;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4, v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    iget-object v4, v7, Lcn1;->d:Ljava/util/List;

    .line 110
    .line 111
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    move v7, v5

    .line 116
    :goto_1
    if-ge v7, v6, :cond_1

    .line 117
    .line 118
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    check-cast v8, Landroid/net/Uri;

    .line 123
    .line 124
    new-instance v9, Lzk0;

    .line 125
    .line 126
    invoke-direct {v9, v0, v8}, Lzk0;-><init>(Lal0;Landroid/net/Uri;)V

    .line 127
    .line 128
    .line 129
    iget-object v10, v0, Lal0;->q:Ljava/util/HashMap;

    .line 130
    .line 131
    invoke-virtual {v10, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    add-int/lit8 v7, v7, 0x1

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_1
    new-instance v8, Led2;

    .line 138
    .line 139
    iget-object v9, v1, Lde3;->b:Lii0;

    .line 140
    .line 141
    iget-object v1, v1, Lde3;->d:Lyl4;

    .line 142
    .line 143
    iget-object v10, v1, Lyl4;->p:Landroid/net/Uri;

    .line 144
    .line 145
    iget-object v11, v1, Lyl4;->q:Ljava/util/Map;

    .line 146
    .line 147
    iget-wide v6, v1, Lyl4;->o:J

    .line 148
    .line 149
    move-wide/from16 v12, p2

    .line 150
    .line 151
    move-wide/from16 v14, p4

    .line 152
    .line 153
    move-wide/from16 v16, v6

    .line 154
    .line 155
    invoke-direct/range {v8 .. v17}, Led2;-><init>(Lii0;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 156
    .line 157
    .line 158
    iget-object v1, v0, Lal0;->q:Ljava/util/HashMap;

    .line 159
    .line 160
    iget-object v4, v0, Lal0;->x:Landroid/net/Uri;

    .line 161
    .line 162
    invoke-virtual {v1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    check-cast v1, Lzk0;

    .line 167
    .line 168
    if-eqz v3, :cond_2

    .line 169
    .line 170
    check-cast v2, Lym1;

    .line 171
    .line 172
    invoke-virtual {v1, v2, v8}, Lzk0;->h(Lym1;Led2;)V

    .line 173
    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_2
    invoke-virtual {v1, v5}, Lzk0;->d(Z)V

    .line 177
    .line 178
    .line 179
    :goto_2
    iget-object v1, v0, Lal0;->p:Li80;

    .line 180
    .line 181
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    iget-object v0, v0, Lal0;->s:Lue1;

    .line 185
    .line 186
    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    const/4 v10, 0x4

    .line 197
    const/4 v11, -0x1

    .line 198
    const/4 v12, 0x0

    .line 199
    const/4 v13, 0x0

    .line 200
    const/4 v14, 0x0

    .line 201
    move-object v9, v8

    .line 202
    move-object v8, v0

    .line 203
    invoke-virtual/range {v8 .. v18}, Lue1;->r(Led2;IILtb1;ILjava/lang/Object;JJ)V

    .line 204
    .line 205
    .line 206
    return-void
.end method

.method public final j(Ljd2;JJI)V
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, Lde3;

    .line 4
    .line 5
    if-nez p6, :cond_0

    .line 6
    .line 7
    new-instance v1, Led2;

    .line 8
    .line 9
    iget-wide v2, v0, Lde3;->a:J

    .line 10
    .line 11
    iget-object v2, v0, Lde3;->b:Lii0;

    .line 12
    .line 13
    move-wide/from16 v7, p2

    .line 14
    .line 15
    invoke-direct {v1, v7, v8, v2}, Led2;-><init>(JLii0;)V

    .line 16
    .line 17
    .line 18
    move-object v5, v1

    .line 19
    :goto_0
    move-object/from16 v1, p0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    move-wide/from16 v7, p2

    .line 23
    .line 24
    new-instance v3, Led2;

    .line 25
    .line 26
    iget-wide v1, v0, Lde3;->a:J

    .line 27
    .line 28
    iget-object v4, v0, Lde3;->b:Lii0;

    .line 29
    .line 30
    iget-object v1, v0, Lde3;->d:Lyl4;

    .line 31
    .line 32
    iget-object v5, v1, Lyl4;->p:Landroid/net/Uri;

    .line 33
    .line 34
    iget-object v6, v1, Lyl4;->q:Ljava/util/Map;

    .line 35
    .line 36
    iget-wide v11, v1, Lyl4;->o:J

    .line 37
    .line 38
    move-wide/from16 v9, p4

    .line 39
    .line 40
    invoke-direct/range {v3 .. v12}, Led2;-><init>(Lii0;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 41
    .line 42
    .line 43
    move-object v5, v3

    .line 44
    goto :goto_0

    .line 45
    :goto_1
    iget-object v4, v1, Lal0;->s:Lue1;

    .line 46
    .line 47
    iget v6, v0, Lde3;->c:I

    .line 48
    .line 49
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    const/4 v7, -0x1

    .line 60
    const/4 v8, 0x0

    .line 61
    const/4 v9, 0x0

    .line 62
    const/4 v10, 0x0

    .line 63
    move/from16 v15, p6

    .line 64
    .line 65
    invoke-virtual/range {v4 .. v15}, Lue1;->u(Led2;IILtb1;ILjava/lang/Object;JJI)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public final s(Ljd2;JJLjava/io/IOException;I)Ldd2;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lde3;

    .line 6
    .line 7
    new-instance v2, Led2;

    .line 8
    .line 9
    iget-wide v3, v1, Lde3;->a:J

    .line 10
    .line 11
    iget-object v3, v1, Lde3;->b:Lii0;

    .line 12
    .line 13
    iget-object v4, v1, Lde3;->d:Lyl4;

    .line 14
    .line 15
    iget-object v5, v4, Lyl4;->p:Landroid/net/Uri;

    .line 16
    .line 17
    move-object v6, v5

    .line 18
    iget-object v5, v4, Lyl4;->q:Ljava/util/Map;

    .line 19
    .line 20
    iget-wide v10, v4, Lyl4;->o:J

    .line 21
    .line 22
    move-wide/from16 v8, p4

    .line 23
    .line 24
    move-object v4, v6

    .line 25
    move-wide/from16 v6, p2

    .line 26
    .line 27
    invoke-direct/range {v2 .. v11}, Led2;-><init>(Lii0;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 28
    .line 29
    .line 30
    iget v4, v1, Lde3;->c:I

    .line 31
    .line 32
    iget-object v1, v0, Lal0;->p:Li80;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-object/from16 v1, p6

    .line 38
    .line 39
    :goto_0
    const/4 v3, 0x1

    .line 40
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    instance-of v7, v1, Landroidx/media3/common/ParserException;

    .line 48
    .line 49
    if-nez v7, :cond_1

    .line 50
    .line 51
    instance-of v7, v1, Ljava/io/FileNotFoundException;

    .line 52
    .line 53
    if-nez v7, :cond_1

    .line 54
    .line 55
    instance-of v7, v1, Landroidx/media3/datasource/HttpDataSource$CleartextNotPermittedException;

    .line 56
    .line 57
    if-nez v7, :cond_1

    .line 58
    .line 59
    instance-of v7, v1, Landroidx/media3/exoplayer/upstream/Loader$UnexpectedLoaderException;

    .line 60
    .line 61
    if-nez v7, :cond_1

    .line 62
    .line 63
    instance-of v7, v1, Landroidx/media3/datasource/DataSourceException;

    .line 64
    .line 65
    if-eqz v7, :cond_0

    .line 66
    .line 67
    move-object v7, v1

    .line 68
    check-cast v7, Landroidx/media3/datasource/DataSourceException;

    .line 69
    .line 70
    iget v7, v7, Landroidx/media3/datasource/DataSourceException;->n:I

    .line 71
    .line 72
    const/16 v8, 0x7d8

    .line 73
    .line 74
    if-ne v7, v8, :cond_0

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    goto :goto_0

    .line 82
    :cond_1
    :goto_1
    move-wide v7, v5

    .line 83
    goto :goto_2

    .line 84
    :cond_2
    add-int/lit8 v1, p7, -0x1

    .line 85
    .line 86
    mul-int/lit16 v1, v1, 0x3e8

    .line 87
    .line 88
    const/16 v7, 0x1388

    .line 89
    .line 90
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    int-to-long v7, v1

    .line 95
    :goto_2
    cmp-long v1, v7, v5

    .line 96
    .line 97
    const/4 v15, 0x0

    .line 98
    if-nez v1, :cond_3

    .line 99
    .line 100
    move v14, v3

    .line 101
    goto :goto_3

    .line 102
    :cond_3
    move v14, v15

    .line 103
    :goto_3
    iget-object v0, v0, Lal0;->s:Lue1;

    .line 104
    .line 105
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    const/4 v5, -0x1

    .line 116
    const/4 v6, 0x0

    .line 117
    move-wide/from16 v16, v7

    .line 118
    .line 119
    const/4 v7, 0x0

    .line 120
    const/4 v8, 0x0

    .line 121
    move-object/from16 v13, p6

    .line 122
    .line 123
    move-object v3, v2

    .line 124
    move-object v2, v0

    .line 125
    move-wide/from16 v0, v16

    .line 126
    .line 127
    invoke-virtual/range {v2 .. v14}, Lue1;->s(Led2;IILtb1;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    .line 128
    .line 129
    .line 130
    if-eqz v14, :cond_4

    .line 131
    .line 132
    sget-object v0, Li61;->t:Ldd2;

    .line 133
    .line 134
    return-object v0

    .line 135
    :cond_4
    new-instance v2, Ldd2;

    .line 136
    .line 137
    invoke-direct {v2, v15, v0, v1, v15}, Ldd2;-><init>(IJZ)V

    .line 138
    .line 139
    .line 140
    return-object v2
.end method
