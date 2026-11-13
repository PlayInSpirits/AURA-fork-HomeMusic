.class public final Ldefpackage/hh3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/gh3;
.implements Ldefpackage/sq3;
.implements Lretrofit2/Callback;
.implements Ldefpackage/d04;
.implements Ldefpackage/q51;
.implements Ldefpackage/n64;


# instance fields
.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/hh3;->n:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final d(Ldefpackage/ge3;)Z
    .locals 5

    .line 1
    sget-object v0, Ldefpackage/y04;->f:Ldefpackage/ge3;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/ge3;->n:Ldefpackage/yw;

    .line 4
    .line 5
    sget-object v1, Ldefpackage/f;->a:Ldefpackage/yw;

    .line 6
    .line 7
    invoke-static {v0, v1}, Ldefpackage/yw;->k(Ldefpackage/yw;Ldefpackage/yw;)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, -0x1

    .line 12
    if-eq v1, v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v1, p0, Ldefpackage/ge3;->n:Ldefpackage/yw;

    .line 16
    .line 17
    sget-object v3, Ldefpackage/f;->b:Ldefpackage/yw;

    .line 18
    .line 19
    invoke-static {v1, v3}, Ldefpackage/yw;->k(Ldefpackage/yw;Ldefpackage/yw;)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    :goto_0
    const/4 v3, 0x1

    .line 24
    const/4 v4, 0x2

    .line 25
    if-eq v1, v2, :cond_1

    .line 26
    .line 27
    add-int/2addr v1, v3

    .line 28
    const/4 p0, 0x0

    .line 29
    invoke-static {v0, v1, p0, v4}, Ldefpackage/yw;->o(Ldefpackage/yw;III)Ldefpackage/yw;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-virtual {p0}, Ldefpackage/ge3;->e()Ljava/lang/Character;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    if-eqz p0, :cond_2

    .line 39
    .line 40
    invoke-virtual {v0}, Ldefpackage/yw;->d()I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-ne p0, v4, :cond_2

    .line 45
    .line 46
    sget-object v0, Ldefpackage/yw;->q:Ldefpackage/yw;

    .line 47
    .line 48
    :cond_2
    :goto_1
    invoke-virtual {v0}, Ldefpackage/yw;->q()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    const-string v0, ".class"

    .line 53
    .line 54
    invoke-static {p0, v0, v3}, Ldefpackage/xm4;->e0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    xor-int/2addr p0, v3

    .line 59
    return p0
.end method

.method public static final f(Ldefpackage/hh3;)V
    .locals 8

    .line 1
    sget-object v0, Ldefpackage/tv3;->z:Ldefpackage/nl4;

    .line 2
    .line 3
    :cond_0
    sget-object v0, Ldefpackage/tv3;->z:Ldefpackage/nl4;

    .line 4
    .line 5
    invoke-virtual {v0}, Ldefpackage/nl4;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ldefpackage/vf3;

    .line 10
    .line 11
    iget-object v2, v1, Ldefpackage/vf3;->p:Ldefpackage/nf3;

    .line 12
    .line 13
    invoke-virtual {v2, p0}, Ldefpackage/nf3;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Ldefpackage/ob2;

    .line 18
    .line 19
    if-nez v3, :cond_1

    .line 20
    .line 21
    move-object v3, v1

    .line 22
    goto :goto_3

    .line 23
    :cond_1
    iget-object v4, v3, Ldefpackage/ob2;->a:Ljava/lang/Object;

    .line 24
    .line 25
    iget-object v3, v3, Ldefpackage/ob2;->b:Ljava/lang/Object;

    .line 26
    .line 27
    iget-object v5, v2, Ldefpackage/nf3;->n:Ldefpackage/xx4;

    .line 28
    .line 29
    const/4 v6, 0x0

    .line 30
    if-eqz p0, :cond_2

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    move v7, v6

    .line 38
    :goto_0
    invoke-virtual {v5, v7, v6, p0}, Ldefpackage/xx4;->v(IILjava/lang/Object;)Ldefpackage/xx4;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    if-ne v5, v6, :cond_3

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    if-nez v6, :cond_4

    .line 46
    .line 47
    sget-object v2, Ldefpackage/nf3;->p:Ldefpackage/nf3;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_4
    new-instance v5, Ldefpackage/nf3;

    .line 51
    .line 52
    iget v2, v2, Ldefpackage/nf3;->o:I

    .line 53
    .line 54
    add-int/lit8 v2, v2, -0x1

    .line 55
    .line 56
    invoke-direct {v5, v6, v2}, Ldefpackage/nf3;-><init>(Ldefpackage/xx4;I)V

    .line 57
    .line 58
    .line 59
    move-object v2, v5

    .line 60
    :goto_1
    sget-object v5, Ldefpackage/fz0;->Z:Ldefpackage/fz0;

    .line 61
    .line 62
    if-eq v4, v5, :cond_5

    .line 63
    .line 64
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    check-cast v6, Ldefpackage/ob2;

    .line 72
    .line 73
    new-instance v7, Ldefpackage/ob2;

    .line 74
    .line 75
    iget-object v6, v6, Ldefpackage/ob2;->a:Ljava/lang/Object;

    .line 76
    .line 77
    invoke-direct {v7, v6, v3}, Ldefpackage/ob2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4, v7}, Ldefpackage/nf3;->a(Ljava/lang/Object;Ldefpackage/ob2;)Ldefpackage/nf3;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    :cond_5
    if-eq v3, v5, :cond_6

    .line 85
    .line 86
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    check-cast v6, Ldefpackage/ob2;

    .line 94
    .line 95
    new-instance v7, Ldefpackage/ob2;

    .line 96
    .line 97
    iget-object v6, v6, Ldefpackage/ob2;->b:Ljava/lang/Object;

    .line 98
    .line 99
    invoke-direct {v7, v4, v6}, Ldefpackage/ob2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v3, v7}, Ldefpackage/nf3;->a(Ljava/lang/Object;Ldefpackage/ob2;)Ldefpackage/nf3;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    :cond_6
    if-eq v4, v5, :cond_7

    .line 107
    .line 108
    iget-object v6, v1, Ldefpackage/vf3;->n:Ljava/lang/Object;

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_7
    move-object v6, v3

    .line 112
    :goto_2
    if-eq v3, v5, :cond_8

    .line 113
    .line 114
    iget-object v4, v1, Ldefpackage/vf3;->o:Ljava/lang/Object;

    .line 115
    .line 116
    :cond_8
    new-instance v3, Ldefpackage/vf3;

    .line 117
    .line 118
    invoke-direct {v3, v6, v4, v2}, Ldefpackage/vf3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/nf3;)V

    .line 119
    .line 120
    .line 121
    :goto_3
    if-eq v1, v3, :cond_9

    .line 122
    .line 123
    invoke-virtual {v0, v1, v3}, Ldefpackage/nl4;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eqz v0, :cond_0

    .line 128
    .line 129
    :cond_9
    return-void
.end method

.method public static h(Ljava/lang/String;Ljava/lang/String;)Ldefpackage/k03;
    .locals 4

    .line 1
    new-instance v0, Ldefpackage/k03;

    .line 2
    .line 3
    invoke-direct {v0}, Ldefpackage/ad2;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ldefpackage/ud3;->D()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static {v1}, Lcom/eddyizm/tempus/App;->e(Ljava/lang/String;)Ldefpackage/pn4;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ldefpackage/pn4;->i()Ldefpackage/wo0;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const-string v2, "BrowsingClient"

    .line 22
    .line 23
    const-string v3, "createShare()"

    .line 24
    .line 25
    invoke-static {v2, v3}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    iget-object v2, v1, Ldefpackage/wo0;->o:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Ldefpackage/hd4;

    .line 31
    .line 32
    iget-object v1, v1, Ldefpackage/wo0;->n:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Ldefpackage/pn4;

    .line 35
    .line 36
    invoke-virtual {v1}, Ldefpackage/pn4;->f()Ljava/util/HashMap;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const/4 v3, 0x0

    .line 41
    invoke-interface {v2, v1, p0, p1, v3}, Ldefpackage/hd4;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lretrofit2/Call;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    new-instance p1, Ldefpackage/q8;

    .line 46
    .line 47
    const/4 v1, 0x4

    .line 48
    invoke-direct {p1, v0, v1}, Ldefpackage/q8;-><init>(Ldefpackage/k03;I)V

    .line 49
    .line 50
    .line 51
    invoke-interface {p0, p1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 52
    .line 53
    .line 54
    return-object v0
.end method

.method public static i(Ljava/lang/String;)Ldefpackage/pr3;
    .locals 2

    .line 1
    const-string v0, "http/1.0"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Ldefpackage/pr3;->p:Ldefpackage/pr3;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string v0, "http/1.1"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    sget-object p0, Ldefpackage/pr3;->q:Ldefpackage/pr3;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    const-string v0, "h2_prior_knowledge"

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    sget-object p0, Ldefpackage/pr3;->t:Ldefpackage/pr3;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_2
    const-string v0, "h2"

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    sget-object p0, Ldefpackage/pr3;->s:Ldefpackage/pr3;

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_3
    const-string v0, "spdy/3.1"

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    sget-object p0, Ldefpackage/pr3;->r:Ldefpackage/pr3;

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_4
    const-string v0, "quic"

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_5

    .line 63
    .line 64
    sget-object p0, Ldefpackage/pr3;->u:Ldefpackage/pr3;

    .line 65
    .line 66
    return-object p0

    .line 67
    :cond_5
    const-string v0, "h3"

    .line 68
    .line 69
    const/4 v1, 0x0

    .line 70
    invoke-static {p0, v0, v1}, Ldefpackage/xm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_6

    .line 75
    .line 76
    sget-object p0, Ldefpackage/pr3;->v:Ldefpackage/pr3;

    .line 77
    .line 78
    return-object p0

    .line 79
    :cond_6
    const-string v0, "Unexpected protocol: "

    .line 80
    .line 81
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    const/4 p0, 0x0

    .line 89
    return-object p0
.end method

.method public static k()Ldefpackage/k03;
    .locals 4

    .line 1
    new-instance v0, Ldefpackage/k03;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ldefpackage/ad2;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-static {v1}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Ldefpackage/pn4;->h()Ldefpackage/wo0;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    const-string v2, "PodcastClient"

    .line 24
    .line 25
    const-string v3, "getNewestPodcasts()"

    .line 26
    .line 27
    invoke-static {v2, v3}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    iget-object v2, v1, Ldefpackage/wo0;->o:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Ldefpackage/hn3;

    .line 33
    .line 34
    iget-object v1, v1, Ldefpackage/wo0;->n:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Ldefpackage/pn4;

    .line 37
    .line 38
    invoke-virtual {v1}, Ldefpackage/pn4;->f()Ljava/util/HashMap;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const/16 v3, 0x14

    .line 43
    .line 44
    invoke-interface {v2, v1, v3}, Ldefpackage/hn3;->f(Ljava/util/Map;I)Lretrofit2/Call;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    new-instance v2, Ldefpackage/ck;

    .line 49
    .line 50
    const/4 v3, 0x1

    .line 51
    invoke-direct {v2, v0, v3}, Ldefpackage/ck;-><init>(Ldefpackage/k03;I)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v1, v2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 55
    .line 56
    .line 57
    return-object v0
.end method

.method public static l(Ljava/lang/String;Z)Ldefpackage/k03;
    .locals 4

    .line 1
    new-instance v0, Ldefpackage/k03;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ldefpackage/ad2;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-static {v1}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Ldefpackage/pn4;->h()Ldefpackage/wo0;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    const-string v2, "PodcastClient"

    .line 24
    .line 25
    const-string v3, "getPodcasts()"

    .line 26
    .line 27
    invoke-static {v2, v3}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    iget-object v2, v1, Ldefpackage/wo0;->o:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Ldefpackage/hn3;

    .line 33
    .line 34
    iget-object v1, v1, Ldefpackage/wo0;->n:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Ldefpackage/pn4;

    .line 37
    .line 38
    invoke-virtual {v1}, Ldefpackage/pn4;->f()Ljava/util/HashMap;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-interface {v2, v1, p1, p0}, Ldefpackage/hn3;->c(Ljava/util/Map;ZLjava/lang/String;)Lretrofit2/Call;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    new-instance p1, Ldefpackage/r8;

    .line 47
    .line 48
    const/4 v1, 0x2

    .line 49
    invoke-direct {p1, v0, v1}, Ldefpackage/r8;-><init>(Ldefpackage/k03;I)V

    .line 50
    .line 51
    .line 52
    invoke-interface {p0, p1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 53
    .line 54
    .line 55
    return-object v0
.end method

.method public static m()Ldefpackage/k03;
    .locals 4

    .line 1
    new-instance v0, Ldefpackage/k03;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ldefpackage/ad2;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-static {v1}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Ldefpackage/pn4;->i()Ldefpackage/wo0;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    const-string v2, "BrowsingClient"

    .line 24
    .line 25
    const-string v3, "getShares()"

    .line 26
    .line 27
    invoke-static {v2, v3}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    iget-object v2, v1, Ldefpackage/wo0;->o:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Ldefpackage/hd4;

    .line 33
    .line 34
    iget-object v1, v1, Ldefpackage/wo0;->n:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Ldefpackage/pn4;

    .line 37
    .line 38
    invoke-virtual {v1}, Ldefpackage/pn4;->f()Ljava/util/HashMap;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-interface {v2, v1}, Ldefpackage/hd4;->b(Ljava/util/Map;)Lretrofit2/Call;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    new-instance v2, Ldefpackage/p8;

    .line 47
    .line 48
    const/4 v3, 0x5

    .line 49
    invoke-direct {v2, v0, v3}, Ldefpackage/p8;-><init>(Ldefpackage/k03;I)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v1, v2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 53
    .line 54
    .line 55
    return-object v0
.end method

.method private final n()V
    .locals 0

    .line 1
    return-void
.end method

.method private final o(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final p(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final q(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final r(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final s(ILjava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public a(Lcom/bumptech/glide/a;Ldefpackage/s92;Ldefpackage/f04;Landroid/content/Context;)Ldefpackage/c04;
    .locals 0

    .line 1
    new-instance p0, Ldefpackage/c04;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Ldefpackage/c04;-><init>(Lcom/bumptech/glide/a;Ldefpackage/s92;Ldefpackage/f04;Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public b(Ldefpackage/gb1;I)Landroid/graphics/Typeface;
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    sget-object p0, Ldefpackage/gb1;->p:Ldefpackage/gb1;

    .line 4
    .line 5
    invoke-static {p1, p0}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    sget-object p0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    sget-object p0, Ldefpackage/gb1;->o:Ldefpackage/gb1;

    .line 15
    .line 16
    iget p1, p1, Ldefpackage/gb1;->n:I

    .line 17
    .line 18
    iget p0, p0, Ldefpackage/gb1;->n:I

    .line 19
    .line 20
    invoke-static {p1, p0}, Ldefpackage/h12;->j(II)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    const/4 p1, 0x0

    .line 25
    const/4 v0, 0x1

    .line 26
    if-ltz p0, :cond_1

    .line 27
    .line 28
    move p0, v0

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move p0, p1

    .line 31
    :goto_0
    if-ne p2, v0, :cond_2

    .line 32
    .line 33
    move p2, v0

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    move p2, p1

    .line 36
    :goto_1
    if-eqz p2, :cond_3

    .line 37
    .line 38
    if-eqz p0, :cond_3

    .line 39
    .line 40
    const/4 p1, 0x3

    .line 41
    goto :goto_2

    .line 42
    :cond_3
    if-eqz p0, :cond_4

    .line 43
    .line 44
    move p1, v0

    .line 45
    goto :goto_2

    .line 46
    :cond_4
    if-eqz p2, :cond_5

    .line 47
    .line 48
    const/4 p1, 0x2

    .line 49
    :cond_5
    :goto_2
    invoke-static {p1}, Landroid/graphics/Typeface;->defaultFromStyle(I)Landroid/graphics/Typeface;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method

.method public c()V
    .locals 1

    .line 1
    iget p0, p0, Ldefpackage/hh3;->n:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p0, "DIAGNOSTIC_PROFILE_IS_COMPRESSED"

    .line 7
    .line 8
    const-string v0, "ProfileInstaller"

    .line 9
    .line 10
    invoke-static {v0, p0}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    :pswitch_0
    return-void

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public e(ILjava/lang/Object;)V
    .locals 2

    .line 1
    iget p0, p0, Ldefpackage/hh3;->n:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    packed-switch p1, :pswitch_data_1

    .line 7
    .line 8
    .line 9
    :pswitch_0
    const-string p0, ""

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :pswitch_1
    const-string p0, "RESULT_DELETE_SKIP_FILE_SUCCESS"

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :pswitch_2
    const-string p0, "RESULT_INSTALL_SKIP_FILE_SUCCESS"

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :pswitch_3
    const-string p0, "RESULT_PARSE_EXCEPTION"

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :pswitch_4
    const-string p0, "RESULT_IO_EXCEPTION"

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :pswitch_5
    const-string p0, "RESULT_BASELINE_PROFILE_NOT_FOUND"

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :pswitch_6
    const-string p0, "RESULT_DESIRED_FORMAT_UNSUPPORTED"

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :pswitch_7
    const-string p0, "RESULT_NOT_WRITABLE"

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :pswitch_8
    const-string p0, "RESULT_UNSUPPORTED_ART_VERSION"

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :pswitch_9
    const-string p0, "RESULT_ALREADY_INSTALLED"

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :pswitch_a
    const-string p0, "RESULT_INSTALL_SUCCESS"

    .line 40
    .line 41
    :goto_0
    const/4 v0, 0x6

    .line 42
    const-string v1, "ProfileInstaller"

    .line 43
    .line 44
    if-eq p1, v0, :cond_0

    .line 45
    .line 46
    const/4 v0, 0x7

    .line 47
    if-eq p1, v0, :cond_0

    .line 48
    .line 49
    const/16 v0, 0x8

    .line 50
    .line 51
    if-eq p1, v0, :cond_0

    .line 52
    .line 53
    invoke-static {v1, p0}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    check-cast p2, Ljava/lang/Throwable;

    .line 58
    .line 59
    invoke-static {v1, p0, p2}, Landroid/util/Ldefpackage/og;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 60
    .line 61
    .line 62
    :goto_1
    :pswitch_b
    return-void

    .line 63
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_b
    .end packed-switch

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public g()Ljava/lang/Object;
    .locals 1

    .line 1
    :try_start_0
    new-instance p0, Ldefpackage/j44;

    .line 2
    .line 3
    const-string v0, "SHA-256"

    .line 4
    .line 5
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-direct {p0, v0}, Ldefpackage/j44;-><init>(Ljava/security/MessageDigest;)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    return-object p0

    .line 13
    :catch_0
    move-exception p0

    .line 14
    invoke-static {p0}, Ldefpackage/er1;->m(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public j()Ldefpackage/k03;
    .locals 5

    .line 1
    new-instance v0, Ldefpackage/k03;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ldefpackage/ad2;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-static {v1}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v2}, Ldefpackage/pn4;->d()Ldefpackage/xc5;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    const-string v3, "InternetRadioClient"

    .line 24
    .line 25
    const-string v4, "getInternetRadioStations()"

    .line 26
    .line 27
    invoke-static {v3, v4}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    iget-object v3, v2, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v3, Ldefpackage/x02;

    .line 33
    .line 34
    iget-object v2, v2, Ldefpackage/xc5;->o:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, Ldefpackage/pn4;

    .line 37
    .line 38
    invoke-virtual {v2}, Ldefpackage/pn4;->f()Ljava/util/HashMap;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-interface {v3, v2}, Ldefpackage/x02;->a(Ljava/util/Map;)Lretrofit2/Call;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    new-instance v3, Ldefpackage/hd5;

    .line 47
    .line 48
    const/16 v4, 0x12

    .line 49
    .line 50
    invoke-direct {v3, p0, v0, v1, v4}, Ldefpackage/hd5;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    .line 51
    .line 52
    .line 53
    invoke-interface {v2, v3}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 54
    .line 55
    .line 56
    return-object v0
.end method

.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/hh3;->n:I

    .line 2
    .line 3
    sparse-switch p0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    :sswitch_0
    return-void

    .line 7
    :sswitch_1
    const-string p0, "QueueRepository"

    .line 8
    .line 9
    const-string p1, "deleteBookmark failed"

    .line 10
    .line 11
    invoke-static {p0, p1, p2}, Landroid/util/Ldefpackage/og;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :sswitch_2
    const-string p0, "QueueRepository"

    .line 16
    .line 17
    const-string p1, "Play queue save failed"

    .line 18
    .line 19
    invoke-static {p0, p1, p2}, Landroid/util/Ldefpackage/og;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :sswitch_data_0
    .sparse-switch
        0x8 -> :sswitch_2
        0x9 -> :sswitch_1
        0x19 -> :sswitch_0
    .end sparse-switch
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 1

    .line 1
    iget p0, p0, Ldefpackage/hh3;->n:I

    .line 2
    .line 3
    const-string p1, "QueueRepository"

    .line 4
    .line 5
    sparse-switch p0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    :sswitch_0
    return-void

    .line 9
    :sswitch_1
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    new-instance p0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v0, "deleteBookmark failed with code: "

    .line 18
    .line 19
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Lretrofit2/Response;->code()I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p1, p0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void

    .line 37
    :sswitch_2
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    const-string p0, "Play queue saved successfully"

    .line 44
    .line 45
    invoke-static {p1, p0}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v0, "Play queue save failed with code: "

    .line 52
    .line 53
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2}, Lretrofit2/Response;->code()I

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {p1, p0}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    :goto_0
    return-void

    .line 71
    :sswitch_data_0
    .sparse-switch
        0x8 -> :sswitch_2
        0x9 -> :sswitch_1
        0x19 -> :sswitch_0
    .end sparse-switch
.end method

.method public onScrollLimit(IIIZ)V
    .locals 0

    .line 1
    return-void
.end method

.method public onScrollProgress(IIII)V
    .locals 0

    .line 1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, Ldefpackage/hh3;->n:I

    .line 2
    .line 3
    const-string v1, ">"

    .line 4
    .line 5
    const-string v2, "<"

    .line 6
    .line 7
    const-string v3, "CreationExtras.Key@"

    .line 8
    .line 9
    const/16 v4, 0x10

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :pswitch_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-static {v4}, Ldefpackage/ya4;->g(I)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v4}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    const-class v0, Landroid/os/Bundle;

    .line 34
    .line 35
    invoke-static {v0}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Ldefpackage/i30;->c()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v3, p0, v2, v0, v1}, Ldefpackage/f34;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :pswitch_1
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    invoke-static {v4}, Ldefpackage/ya4;->g(I)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v4}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    const-class v0, Ldefpackage/f75;

    .line 63
    .line 64
    invoke-static {v0}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, Ldefpackage/i30;->c()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v3, p0, v2, v0, v1}, Ldefpackage/f34;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :pswitch_2
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    invoke-static {v4}, Ldefpackage/ya4;->g(I)V

    .line 82
    .line 83
    .line 84
    invoke-static {p0, v4}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    const-class v0, Ldefpackage/j54;

    .line 92
    .line 93
    invoke-static {v0}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v0}, Ldefpackage/i30;->c()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-static {v3, p0, v2, v0, v1}, Ldefpackage/f34;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0

    .line 106
    nop

    .line 107
    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
