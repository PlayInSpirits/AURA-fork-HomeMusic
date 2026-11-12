.class public final Lev3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Lbv3;

.field public final b:Ljava/util/ArrayList;

.field public final c:I

.field public final d:Ly10;

.field public final e:Loz3;

.field public final f:I

.field public final g:I

.field public final h:I

.field public i:I


# direct methods
.method public constructor <init>(Lbv3;Ljava/util/ArrayList;ILy10;Loz3;III)V
    .locals 0

    .line 1
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lev3;->a:Lbv3;

    .line 8
    .line 9
    iput-object p2, p0, Lev3;->b:Ljava/util/ArrayList;

    .line 10
    .line 11
    iput p3, p0, Lev3;->c:I

    .line 12
    .line 13
    iput-object p4, p0, Lev3;->d:Ly10;

    .line 14
    .line 15
    iput-object p5, p0, Lev3;->e:Loz3;

    .line 16
    .line 17
    iput p6, p0, Lev3;->f:I

    .line 18
    .line 19
    iput p7, p0, Lev3;->g:I

    .line 20
    .line 21
    iput p8, p0, Lev3;->h:I

    .line 22
    .line 23
    return-void
.end method

.method public static a(Lev3;ILy10;Loz3;I)Lev3;
    .locals 9

    .line 1
    and-int/lit8 v0, p4, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget p1, p0, Lev3;->c:I

    .line 6
    .line 7
    :cond_0
    move v3, p1

    .line 8
    and-int/lit8 p1, p4, 0x2

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget-object p2, p0, Lev3;->d:Ly10;

    .line 13
    .line 14
    :cond_1
    move-object v4, p2

    .line 15
    and-int/lit8 p1, p4, 0x4

    .line 16
    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    iget-object p3, p0, Lev3;->e:Loz3;

    .line 20
    .line 21
    :cond_2
    move-object v5, p3

    .line 22
    iget v6, p0, Lev3;->f:I

    .line 23
    .line 24
    iget v7, p0, Lev3;->g:I

    .line 25
    .line 26
    iget v8, p0, Lev3;->h:I

    .line 27
    .line 28
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance v0, Lev3;

    .line 32
    .line 33
    iget-object v1, p0, Lev3;->a:Lbv3;

    .line 34
    .line 35
    iget-object v2, p0, Lev3;->b:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct/range {v0 .. v8}, Lev3;-><init>(Lbv3;Ljava/util/ArrayList;ILy10;Loz3;III)V

    .line 38
    .line 39
    .line 40
    return-object v0
.end method


# virtual methods
.method public final b(Loz3;)Lk14;
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lev3;->b:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    iget v3, p0, Lev3;->c:I

    .line 12
    .line 13
    if-ge v3, v1, :cond_6

    .line 14
    .line 15
    iget v1, p0, Lev3;->i:I

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    add-int/2addr v1, v4

    .line 19
    iput v1, p0, Lev3;->i:I

    .line 20
    .line 21
    const-string v1, " must call proceed() exactly once"

    .line 22
    .line 23
    iget-object v5, p0, Lev3;->d:Ly10;

    .line 24
    .line 25
    const-string v6, "network interceptor "

    .line 26
    .line 27
    if-eqz v5, :cond_2

    .line 28
    .line 29
    iget-object v7, v5, Ly10;->e:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v7, Ls21;

    .line 32
    .line 33
    invoke-interface {v7}, Ls21;->d()Lr34;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    iget-object v8, p1, Loz3;->a:Lgr1;

    .line 38
    .line 39
    invoke-interface {v7, v8}, Lr34;->f(Lgr1;)Z

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    if-eqz v7, :cond_1

    .line 44
    .line 45
    iget v7, p0, Lev3;->i:I

    .line 46
    .line 47
    if-ne v7, v4, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    sub-int/2addr v3, v4

    .line 51
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p0, v1, v6}, Lnz2;->z(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v2

    .line 59
    :cond_1
    sub-int/2addr v3, v4

    .line 60
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    const-string p1, " must retain the same host and port"

    .line 65
    .line 66
    invoke-static {p0, p1, v6}, Lnz2;->z(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-object v2

    .line 70
    :cond_2
    :goto_0
    add-int/lit8 v7, v3, 0x1

    .line 71
    .line 72
    const/16 v8, 0x3a

    .line 73
    .line 74
    invoke-static {p0, v7, v2, p1, v8}, Lev3;->a(Lev3;ILy10;Loz3;I)Lev3;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, Lr02;

    .line 83
    .line 84
    invoke-interface {p1, p0}, Lr02;->a(Lev3;)Lk14;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    if-eqz v3, :cond_5

    .line 89
    .line 90
    if-eqz v5, :cond_4

    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-ge v7, v0, :cond_4

    .line 97
    .line 98
    iget p0, p0, Lev3;->i:I

    .line 99
    .line 100
    if-ne p0, v4, :cond_3

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_3
    invoke-static {p1, v1, v6}, Lnz2;->z(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    return-object v2

    .line 107
    :cond_4
    :goto_1
    return-object v3

    .line 108
    :cond_5
    new-instance p0, Ljava/lang/NullPointerException;

    .line 109
    .line 110
    new-instance v0, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v1, "interceptor "

    .line 113
    .line 114
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string p1, " returned null"

    .line 121
    .line 122
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw p0

    .line 133
    :cond_6
    const-string p0, "Check failed."

    .line 134
    .line 135
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    return-object v2
.end method
