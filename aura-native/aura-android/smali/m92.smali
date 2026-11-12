.class public final Lm92;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final g:Ljava/lang/String;

.field public static final h:Ljava/lang/String;

.field public static final i:Ljava/lang/String;

.field public static final j:Ljava/lang/String;

.field public static final k:Ljava/lang/String;

.field public static final l:Ljava/lang/String;


# instance fields
.field public final a:I

.field public final b:J

.field public final c:Ljava/lang/Object;

.field public final d:I

.field public final e:Ljn2;

.field public final f:Lxa4;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lf35;->a:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/16 v1, 0x24

    .line 5
    .line 6
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lm92;->g:Ljava/lang/String;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lm92;->h:Ljava/lang/String;

    .line 18
    .line 19
    const/4 v0, 0x2

    .line 20
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Lm92;->i:Ljava/lang/String;

    .line 25
    .line 26
    const/4 v0, 0x3

    .line 27
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lm92;->j:Ljava/lang/String;

    .line 32
    .line 33
    const/4 v0, 0x4

    .line 34
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lm92;->k:Ljava/lang/String;

    .line 39
    .line 40
    const/4 v0, 0x5

    .line 41
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lm92;->l:Ljava/lang/String;

    .line 46
    .line 47
    return-void
.end method

.method public constructor <init>(IJLjn2;Lxa4;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lm92;->a:I

    .line 5
    .line 6
    iput-wide p2, p0, Lm92;->b:J

    .line 7
    .line 8
    iput-object p4, p0, Lm92;->e:Ljn2;

    .line 9
    .line 10
    iput-object p5, p0, Lm92;->f:Lxa4;

    .line 11
    .line 12
    iput-object p6, p0, Lm92;->c:Ljava/lang/Object;

    .line 13
    .line 14
    iput p7, p0, Lm92;->d:I

    .line 15
    .line 16
    return-void
.end method

.method public static a(Landroid/os/Bundle;)Lm92;
    .locals 10

    .line 1
    sget-object v0, Lm92;->g:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    move-result v3

    .line 8
    sget-object v0, Lm92;->h:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 11
    .line 12
    .line 13
    move-result-wide v4

    .line 14
    invoke-virtual {p0, v0, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 15
    .line 16
    .line 17
    move-result-wide v4

    .line 18
    sget-object v0, Lm92;->i:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v2, 0x0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    move-object v6, v2

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {v0}, Ljn2;->a(Landroid/os/Bundle;)Ljn2;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    move-object v6, v0

    .line 34
    :goto_0
    sget-object v0, Lm92;->l:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    invoke-static {v0}, Lxa4;->a(Landroid/os/Bundle;)Lxa4;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :goto_1
    move-object v7, v0

    .line 47
    goto :goto_2

    .line 48
    :cond_1
    if-eqz v3, :cond_2

    .line 49
    .line 50
    new-instance v0, Lxa4;

    .line 51
    .line 52
    const-string v7, "no error message provided"

    .line 53
    .line 54
    invoke-direct {v0, v3, v7}, Lxa4;-><init>(ILjava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    move-object v7, v2

    .line 59
    :goto_2
    sget-object v0, Lm92;->k:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v9

    .line 65
    const/4 v0, 0x1

    .line 66
    if-eq v9, v0, :cond_7

    .line 67
    .line 68
    sget-object v0, Lm92;->j:Ljava/lang/String;

    .line 69
    .line 70
    const/4 v8, 0x2

    .line 71
    if-eq v9, v8, :cond_8

    .line 72
    .line 73
    const/4 v8, 0x3

    .line 74
    if-eq v9, v8, :cond_4

    .line 75
    .line 76
    const/4 p0, 0x4

    .line 77
    if-ne v9, p0, :cond_3

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_3
    invoke-static {}, Ltb4;->a()V

    .line 81
    .line 82
    .line 83
    return-object v2

    .line 84
    :cond_4
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    if-nez p0, :cond_5

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_5
    invoke-static {p0}, Liw;->a(Landroid/os/IBinder;)Lyw1;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {}, Lyw1;->j()Luw1;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    :goto_3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-ge v1, v2, :cond_6

    .line 104
    .line 105
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    check-cast v2, Landroid/os/Bundle;

    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-static {v2}, Lgn2;->b(Landroid/os/Bundle;)Lgn2;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-virtual {v0, v2}, Lpw1;->c(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    add-int/lit8 v1, v1, 0x1

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_6
    invoke-virtual {v0}, Luw1;->f()Lgy3;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    :cond_7
    :goto_4
    move-object v8, v2

    .line 129
    goto :goto_5

    .line 130
    :cond_8
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    if-nez p0, :cond_9

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_9
    invoke-static {p0}, Lgn2;->b(Landroid/os/Bundle;)Lgn2;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    goto :goto_4

    .line 142
    :goto_5
    new-instance v2, Lm92;

    .line 143
    .line 144
    invoke-direct/range {v2 .. v9}, Lm92;-><init>(IJLjn2;Lxa4;Ljava/lang/Object;I)V

    .line 145
    .line 146
    .line 147
    return-object v2
.end method

.method public static b(I)Lm92;
    .locals 8

    .line 1
    new-instance v5, Lxa4;

    .line 2
    .line 3
    const-string v0, "no error message provided"

    .line 4
    .line 5
    sget-object v1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-direct {v5, v0, p0, v1}, Lxa4;-><init>(Ljava/lang/String;ILandroid/os/Bundle;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Lm92;

    .line 11
    .line 12
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x4

    .line 18
    iget v1, v5, Lxa4;->a:I

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    invoke-direct/range {v0 .. v7}, Lm92;-><init>(IJLjn2;Lxa4;Ljava/lang/Object;I)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public static c(Lgy3;Ljn2;)Lm92;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lyw1;->m(I)Lvw1;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    :goto_0
    invoke-virtual {v0}, Lv0;->hasNext()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lv0;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lgn2;

    .line 17
    .line 18
    invoke-static {v1}, Lm92;->d(Lgn2;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v2, Lm92;

    .line 23
    .line 24
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 25
    .line 26
    .line 27
    move-result-wide v4

    .line 28
    invoke-static {p0}, Lyw1;->k(Ljava/util/Collection;)Lyw1;

    .line 29
    .line 30
    .line 31
    move-result-object v8

    .line 32
    const/4 v9, 0x3

    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v7, 0x0

    .line 35
    move-object v6, p1

    .line 36
    invoke-direct/range {v2 .. v9}, Lm92;-><init>(IJLjn2;Lxa4;Ljava/lang/Object;I)V

    .line 37
    .line 38
    .line 39
    return-object v2
.end method

.method public static d(Lgn2;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lgn2;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    xor-int/2addr v0, v1

    .line 9
    const-string v2, "mediaId must not be empty"

    .line 10
    .line 11
    invoke-static {v2, v0}, Lrr2;->k(Ljava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lgn2;->d:Ldo2;

    .line 15
    .line 16
    iget-object v0, p0, Ldo2;->q:Ljava/lang/Boolean;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    move v0, v1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v0, v2

    .line 24
    :goto_0
    const-string v3, "mediaMetadata must specify isBrowsable"

    .line 25
    .line 26
    invoke-static {v3, v0}, Lrr2;->k(Ljava/lang/String;Z)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Ldo2;->r:Ljava/lang/Boolean;

    .line 30
    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v1, v2

    .line 35
    :goto_1
    const-string p0, "mediaMetadata must specify isPlayable"

    .line 36
    .line 37
    invoke-static {p0, v1}, Lrr2;->k(Ljava/lang/String;Z)V

    .line 38
    .line 39
    .line 40
    return-void
.end method
