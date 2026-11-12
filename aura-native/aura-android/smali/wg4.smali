.class public final Lwg4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ly71;


# instance fields
.field public final a:Lrf2;

.field public final b:Lui0;

.field public final c:Lck4;

.field public final d:Lsq0;


# direct methods
.method public constructor <init>(Lrf2;Lui0;Lck4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwg4;->a:Lrf2;

    .line 5
    .line 6
    iput-object p2, p0, Lwg4;->b:Lui0;

    .line 7
    .line 8
    iput-object p3, p0, Lwg4;->c:Lck4;

    .line 9
    .line 10
    sget-object p1, Lv64;->b:Lsq0;

    .line 11
    .line 12
    iput-object p1, p0, Lwg4;->d:Lsq0;

    .line 13
    .line 14
    return-void
.end method

.method public static final b(Lwg4;Lq64;FFLtg4;Lwd0;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p5, Lvg4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Lvg4;

    .line 7
    .line 8
    iget v1, v0, Lvg4;->p:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lvg4;->p:I

    .line 18
    .line 19
    :goto_0
    move-object p5, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lvg4;

    .line 22
    .line 23
    invoke-direct {v0, p0, p5}, Lvg4;-><init>(Lwg4;Lwd0;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object v0, p5, Lvg4;->n:Ljava/lang/Object;

    .line 28
    .line 29
    iget v1, p5, Lvg4;->p:I

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    if-ne v1, v2, :cond_1

    .line 35
    .line 36
    invoke-static {v0}, Lkb4;->X(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto/16 :goto_5

    .line 40
    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x0

    .line 47
    return-object p0

    .line 48
    :cond_2
    invoke-static {v0}, Lkb4;->X(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    const/4 v1, 0x0

    .line 56
    cmpg-float v0, v0, v1

    .line 57
    .line 58
    const/16 v3, 0x1c

    .line 59
    .line 60
    if-nez v0, :cond_3

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    cmpg-float v0, v0, v1

    .line 68
    .line 69
    if-nez v0, :cond_4

    .line 70
    .line 71
    :goto_2
    invoke-static {p2, p3, v3}, Lj51;->a(FFI)Lxd;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :cond_4
    iput v2, p5, Lvg4;->p:I

    .line 77
    .line 78
    iget-object v0, p0, Lwg4;->b:Lui0;

    .line 79
    .line 80
    new-instance v2, Lna4;

    .line 81
    .line 82
    iget-object v4, v0, Lui0;->a:Lrm2;

    .line 83
    .line 84
    invoke-direct {v2, v4}, Lna4;-><init>(Lrm2;)V

    .line 85
    .line 86
    .line 87
    new-instance v4, Lzd;

    .line 88
    .line 89
    invoke-direct {v4, v1}, Lzd;-><init>(F)V

    .line 90
    .line 91
    .line 92
    new-instance v1, Lzd;

    .line 93
    .line 94
    invoke-direct {v1, p3}, Lzd;-><init>(F)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v4, v1}, Lna4;->D(Lce;Lce;)Lce;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    check-cast v1, Lzd;

    .line 102
    .line 103
    iget v1, v1, Lzd;->a:F

    .line 104
    .line 105
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    cmpl-float v1, v1, v2

    .line 114
    .line 115
    if-ltz v1, :cond_5

    .line 116
    .line 117
    new-instance p0, Lhg3;

    .line 118
    .line 119
    const/16 v1, 0xd

    .line 120
    .line 121
    invoke-direct {p0, v1, v0}, Lhg3;-><init>(ILjava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    :goto_3
    move v0, p2

    .line 125
    goto :goto_4

    .line 126
    :cond_5
    new-instance v0, Lpz1;

    .line 127
    .line 128
    iget-object p0, p0, Lwg4;->c:Lck4;

    .line 129
    .line 130
    invoke-direct {v0, v3, p0}, Lpz1;-><init>(ILjava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    move-object p0, v0

    .line 134
    goto :goto_3

    .line 135
    :goto_4
    new-instance p2, Ljava/lang/Float;

    .line 136
    .line 137
    invoke-direct {p2, v0}, Ljava/lang/Float;-><init>(F)V

    .line 138
    .line 139
    .line 140
    move v0, p3

    .line 141
    new-instance p3, Ljava/lang/Float;

    .line 142
    .line 143
    invoke-direct {p3, v0}, Ljava/lang/Float;-><init>(F)V

    .line 144
    .line 145
    .line 146
    invoke-interface/range {p0 .. p5}, Lci;->z(Lq64;Ljava/lang/Float;Ljava/lang/Float;Lif1;Lvg4;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    sget-object p0, Lxe0;->n:Lxe0;

    .line 151
    .line 152
    if-ne v0, p0, :cond_6

    .line 153
    .line 154
    return-object p0

    .line 155
    :cond_6
    :goto_5
    check-cast v0, Lud;

    .line 156
    .line 157
    iget-object p0, v0, Lud;->b:Lxd;

    .line 158
    .line 159
    return-object p0
.end method


# virtual methods
.method public a(Lc74;FLvd0;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lq05;->c:Lo54;

    .line 2
    .line 3
    check-cast p3, Lwd0;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, v0, p3}, Lwg4;->d(Lq64;FLif1;Lwd0;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final c(Lq64;FLif1;Lwd0;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p4, Lsg4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lsg4;

    .line 7
    .line 8
    iget v1, v0, Lsg4;->q:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lsg4;->q:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lsg4;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lsg4;-><init>(Lwg4;Lwd0;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lsg4;->o:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lsg4;->q:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object p3, v0, Lsg4;->n:Lif1;

    .line 35
    .line 36
    invoke-static {p4}, Lkb4;->X(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p4}, Lkb4;->X(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    new-instance v3, Ltk0;

    .line 51
    .line 52
    const/4 v8, 0x0

    .line 53
    move-object v4, p0

    .line 54
    move-object v7, p1

    .line 55
    move v5, p2

    .line 56
    move-object v6, p3

    .line 57
    invoke-direct/range {v3 .. v8}, Ltk0;-><init>(Lwg4;FLif1;Lq64;Lvd0;)V

    .line 58
    .line 59
    .line 60
    iput-object v6, v0, Lsg4;->n:Lif1;

    .line 61
    .line 62
    iput v2, v0, Lsg4;->q:I

    .line 63
    .line 64
    iget-object p0, v4, Lwg4;->d:Lsq0;

    .line 65
    .line 66
    invoke-static {p0, v3, v0}, Lfu;->P(Lne0;Lwf1;Lwd0;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p4

    .line 70
    sget-object p0, Lxe0;->n:Lxe0;

    .line 71
    .line 72
    if-ne p4, p0, :cond_3

    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_3
    move-object p3, v6

    .line 76
    :goto_1
    check-cast p4, Lud;

    .line 77
    .line 78
    new-instance p0, Ljava/lang/Float;

    .line 79
    .line 80
    const/4 p1, 0x0

    .line 81
    invoke-direct {p0, p1}, Ljava/lang/Float;-><init>(F)V

    .line 82
    .line 83
    .line 84
    invoke-interface {p3, p0}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    return-object p4
.end method

.method public final d(Lq64;FLif1;Lwd0;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p4, Lug4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lug4;

    .line 7
    .line 8
    iget v1, v0, Lug4;->p:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lug4;->p:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lug4;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lug4;-><init>(Lwg4;Lwd0;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lug4;->n:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lug4;->p:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    invoke-static {p4}, Lkb4;->X(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    return-object p0

    .line 45
    :cond_2
    invoke-static {p4}, Lkb4;->X(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iput v2, v0, Lug4;->p:I

    .line 49
    .line 50
    invoke-virtual {p0, p1, p2, p3, v0}, Lwg4;->c(Lq64;FLif1;Lwd0;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p4

    .line 54
    sget-object p0, Lxe0;->n:Lxe0;

    .line 55
    .line 56
    if-ne p4, p0, :cond_3

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_3
    :goto_1
    check-cast p4, Lud;

    .line 60
    .line 61
    iget-object p0, p4, Lud;->a:Ljava/lang/Float;

    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    iget-object p1, p4, Lud;->b:Lxd;

    .line 68
    .line 69
    const/4 p2, 0x0

    .line 70
    cmpg-float p0, p0, p2

    .line 71
    .line 72
    if-nez p0, :cond_4

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_4
    invoke-virtual {p1}, Lxd;->a()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, Ljava/lang/Number;

    .line 80
    .line 81
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    :goto_2
    new-instance p0, Ljava/lang/Float;

    .line 86
    .line 87
    invoke-direct {p0, p2}, Ljava/lang/Float;-><init>(F)V

    .line 88
    .line 89
    .line 90
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lwg4;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    check-cast p1, Lwg4;

    .line 7
    .line 8
    iget-object v0, p1, Lwg4;->c:Lck4;

    .line 9
    .line 10
    iget-object v2, p0, Lwg4;->c:Lck4;

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Lck4;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p1, Lwg4;->b:Lui0;

    .line 19
    .line 20
    iget-object v2, p0, Lwg4;->b:Lui0;

    .line 21
    .line 22
    invoke-static {v0, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object p1, p1, Lwg4;->a:Lrf2;

    .line 29
    .line 30
    iget-object p0, p0, Lwg4;->a:Lrf2;

    .line 31
    .line 32
    if-eq p1, p0, :cond_0

    .line 33
    .line 34
    return v1

    .line 35
    :cond_0
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lwg4;->c:Lck4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lck4;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lwg4;->b:Lui0;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-object p0, p0, Lwg4;->a:Lrf2;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    add-int/2addr p0, v1

    .line 25
    return p0
.end method
