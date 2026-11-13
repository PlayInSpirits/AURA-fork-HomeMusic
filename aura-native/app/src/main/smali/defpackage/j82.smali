.class public final Ldefpackage/j82;
.super Ldefpackage/r14;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/wf1;


# instance fields
.field public o:Ldefpackage/on3;

.field public p:Ldefpackage/on3;

.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ldefpackage/lm0;


# direct methods
.method public constructor <init>(Ldefpackage/lm0;Ldefpackage/vd0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldefpackage/j82;->s:Ldefpackage/lm0;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ldefpackage/r14;-><init>(Ldefpackage/vd0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldefpackage/vd0;)Ldefpackage/vd0;
    .locals 1

    .line 1
    new-instance v0, Ldefpackage/j82;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/j82;->s:Ldefpackage/lm0;

    .line 4
    .line 5
    invoke-direct {v0, p0, p2}, Ldefpackage/j82;-><init>(Ldefpackage/lm0;Ldefpackage/vd0;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Ldefpackage/j82;->r:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ldefpackage/hp4;

    .line 2
    .line 3
    check-cast p2, Ldefpackage/vd0;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Ldefpackage/j82;->create(Ljava/lang/Object;Ldefpackage/vd0;)Ldefpackage/vd0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ldefpackage/j82;

    .line 10
    .line 11
    sget-object p1, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ldefpackage/j82;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v0, p0, Ldefpackage/j82;->s:Ldefpackage/lm0;

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/ad3;->c:Ldefpackage/zd3;

    .line 4
    .line 5
    iget v1, p0, Ldefpackage/j82;->q:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    sget-object v3, Ldefpackage/ln3;->n:Ldefpackage/ln3;

    .line 9
    .line 10
    const/4 v4, 0x2

    .line 11
    const/4 v5, 0x1

    .line 12
    sget-object v6, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 13
    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    if-eq v1, v5, :cond_1

    .line 17
    .line 18
    if-ne v1, v4, :cond_0

    .line 19
    .line 20
    iget-object v1, p0, Ldefpackage/j82;->p:Ldefpackage/on3;

    .line 21
    .line 22
    iget-object v2, p0, Ldefpackage/j82;->o:Ldefpackage/on3;

    .line 23
    .line 24
    iget-object v5, p0, Ldefpackage/j82;->r:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v5, Ldefpackage/hp4;

    .line 27
    .line 28
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_3

    .line 32
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object v2

    .line 38
    :cond_1
    iget-object v1, p0, Ldefpackage/j82;->r:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Ldefpackage/hp4;

    .line 41
    .line 42
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Ldefpackage/j82;->r:Ljava/lang/Object;

    .line 50
    .line 51
    move-object v1, p1

    .line 52
    check-cast v1, Ldefpackage/hp4;

    .line 53
    .line 54
    iput-object v1, p0, Ldefpackage/j82;->r:Ljava/lang/Object;

    .line 55
    .line 56
    iput v5, p0, Ldefpackage/j82;->q:I

    .line 57
    .line 58
    invoke-static {v1, v3, p0}, Ldefpackage/vq4;->a(Ldefpackage/hp4;Ldefpackage/ln3;Ldefpackage/jp;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-ne p1, v6, :cond_3

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    :goto_0
    check-cast p1, Ldefpackage/on3;

    .line 66
    .line 67
    new-instance v5, Ldefpackage/g83;

    .line 68
    .line 69
    const-wide/16 v7, 0x0

    .line 70
    .line 71
    invoke-direct {v5, v7, v8}, Ldefpackage/g83;-><init>(J)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v5}, Ldefpackage/zd3;->setValue(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    move-object v5, v1

    .line 78
    :goto_1
    if-nez v2, :cond_7

    .line 79
    .line 80
    iput-object v5, p0, Ldefpackage/j82;->r:Ljava/lang/Object;

    .line 81
    .line 82
    iput-object p1, p0, Ldefpackage/j82;->o:Ldefpackage/on3;

    .line 83
    .line 84
    iput-object v2, p0, Ldefpackage/j82;->p:Ldefpackage/on3;

    .line 85
    .line 86
    iput v4, p0, Ldefpackage/j82;->q:I

    .line 87
    .line 88
    invoke-virtual {v5, v3, p0}, Ldefpackage/hp4;->a(Ldefpackage/ln3;Ldefpackage/jp;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    if-ne v1, v6, :cond_4

    .line 93
    .line 94
    :goto_2
    return-object v6

    .line 95
    :cond_4
    move-object v12, v2

    .line 96
    move-object v2, p1

    .line 97
    move-object p1, v1

    .line 98
    move-object v1, v12

    .line 99
    :goto_3
    check-cast p1, Ldefpackage/kn3;

    .line 100
    .line 101
    iget-object v7, p1, Ldefpackage/kn3;->a:Ljava/util/List;

    .line 102
    .line 103
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    const/4 v9, 0x0

    .line 108
    move v10, v9

    .line 109
    :goto_4
    if-ge v10, v8, :cond_6

    .line 110
    .line 111
    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v11

    .line 115
    check-cast v11, Ldefpackage/on3;

    .line 116
    .line 117
    invoke-static {v11}, Ldefpackage/gi1;->h(Ldefpackage/on3;)Z

    .line 118
    .line 119
    .line 120
    move-result v11

    .line 121
    if-nez v11, :cond_5

    .line 122
    .line 123
    move-object p1, v2

    .line 124
    move-object v2, v1

    .line 125
    goto :goto_1

    .line 126
    :cond_5
    add-int/lit8 v10, v10, 0x1

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_6
    iget-object p1, p1, Ldefpackage/kn3;->a:Ljava/util/List;

    .line 130
    .line 131
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    check-cast p1, Ldefpackage/on3;

    .line 136
    .line 137
    move-object v12, v2

    .line 138
    move-object v2, p1

    .line 139
    move-object p1, v12

    .line 140
    goto :goto_1

    .line 141
    :cond_7
    iget-wide v1, v2, Ldefpackage/on3;->c:J

    .line 142
    .line 143
    iget-wide p0, p1, Ldefpackage/on3;->c:J

    .line 144
    .line 145
    invoke-static {v1, v2, p0, p1}, Ldefpackage/g83;->d(JJ)J

    .line 146
    .line 147
    .line 148
    move-result-wide p0

    .line 149
    new-instance v1, Ldefpackage/g83;

    .line 150
    .line 151
    invoke-direct {v1, p0, p1}, Ldefpackage/g83;-><init>(J)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v1}, Ldefpackage/zd3;->setValue(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 158
    .line 159
    return-object p0
.end method
