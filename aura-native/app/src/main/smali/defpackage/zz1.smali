.class public abstract Ldefpackage/zz1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static a:Landroid/content/Context;

.field public static b:Ljava/lang/Boolean;

.field public static final c:[Ljava/lang/Object;

.field public static final d:Ldefpackage/f01;

.field public static final e:Ldefpackage/f01;

.field public static final f:Ldefpackage/f01;

.field public static final g:Ldefpackage/f01;

.field public static final h:Ldefpackage/f01;

.field public static final i:Ldefpackage/n01;

.field public static final j:Ldefpackage/n01;

.field public static final k:Ldefpackage/p94;

.field public static final l:Ldefpackage/p94;

.field public static final m:Ldefpackage/p94;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    sput-object v0, Ldefpackage/zz1;->c:[Ljava/lang/Object;

    .line 5
    .line 6
    new-instance v0, Ldefpackage/f01;

    .line 7
    .line 8
    const-string v1, "COMPLETING_ALREADY"

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-direct {v0, v2, v1}, Ldefpackage/f01;-><init>(ILjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Ldefpackage/zz1;->d:Ldefpackage/f01;

    .line 15
    .line 16
    new-instance v0, Ldefpackage/f01;

    .line 17
    .line 18
    const-string v1, "COMPLETING_WAITING_CHILDREN"

    .line 19
    .line 20
    invoke-direct {v0, v2, v1}, Ldefpackage/f01;-><init>(ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Ldefpackage/zz1;->e:Ldefpackage/f01;

    .line 24
    .line 25
    new-instance v0, Ldefpackage/f01;

    .line 26
    .line 27
    const-string v1, "COMPLETING_RETRY"

    .line 28
    .line 29
    invoke-direct {v0, v2, v1}, Ldefpackage/f01;-><init>(ILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Ldefpackage/zz1;->f:Ldefpackage/f01;

    .line 33
    .line 34
    new-instance v0, Ldefpackage/f01;

    .line 35
    .line 36
    const-string v1, "TOO_LATE_TO_CANCEL"

    .line 37
    .line 38
    invoke-direct {v0, v2, v1}, Ldefpackage/f01;-><init>(ILjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    sput-object v0, Ldefpackage/zz1;->g:Ldefpackage/f01;

    .line 42
    .line 43
    new-instance v0, Ldefpackage/f01;

    .line 44
    .line 45
    const-string v1, "SEALED"

    .line 46
    .line 47
    invoke-direct {v0, v2, v1}, Ldefpackage/f01;-><init>(ILjava/lang/String;)V

    .line 48
    .line 49
    .line 50
    sput-object v0, Ldefpackage/zz1;->h:Ldefpackage/f01;

    .line 51
    .line 52
    new-instance v0, Ldefpackage/n01;

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    invoke-direct {v0, v1}, Ldefpackage/n01;-><init>(Z)V

    .line 56
    .line 57
    .line 58
    sput-object v0, Ldefpackage/zz1;->i:Ldefpackage/n01;

    .line 59
    .line 60
    new-instance v0, Ldefpackage/n01;

    .line 61
    .line 62
    const/4 v1, 0x1

    .line 63
    invoke-direct {v0, v1}, Ldefpackage/n01;-><init>(Z)V

    .line 64
    .line 65
    .line 66
    sput-object v0, Ldefpackage/zz1;->j:Ldefpackage/n01;

    .line 67
    .line 68
    new-instance v0, Ldefpackage/p94;

    .line 69
    .line 70
    new-instance v1, Ldefpackage/m94;

    .line 71
    .line 72
    const/4 v2, 0x6

    .line 73
    invoke-direct {v1, v2}, Ldefpackage/m94;-><init>(I)V

    .line 74
    .line 75
    .line 76
    const-string v2, "TestTagsAsResourceId"

    .line 77
    .line 78
    const/4 v3, 0x0

    .line 79
    invoke-direct {v0, v2, v3, v1}, Ldefpackage/p94;-><init>(Ljava/lang/String;ZLdefpackage/wf1;)V

    .line 80
    .line 81
    .line 82
    sput-object v0, Ldefpackage/zz1;->k:Ldefpackage/p94;

    .line 83
    .line 84
    new-instance v0, Ldefpackage/n54;

    .line 85
    .line 86
    const/16 v1, 0x1c

    .line 87
    .line 88
    invoke-direct {v0, v1}, Ldefpackage/n54;-><init>(I)V

    .line 89
    .line 90
    .line 91
    new-instance v1, Ldefpackage/p94;

    .line 92
    .line 93
    const/4 v2, 0x1

    .line 94
    const-string v4, "AccessibilityClassName"

    .line 95
    .line 96
    invoke-direct {v1, v4, v2, v0}, Ldefpackage/p94;-><init>(Ljava/lang/String;ZLdefpackage/wf1;)V

    .line 97
    .line 98
    .line 99
    sput-object v1, Ldefpackage/zz1;->l:Ldefpackage/p94;

    .line 100
    .line 101
    new-instance v0, Ldefpackage/p94;

    .line 102
    .line 103
    new-instance v1, Ldefpackage/m94;

    .line 104
    .line 105
    const/4 v2, 0x7

    .line 106
    invoke-direct {v1, v2}, Ldefpackage/m94;-><init>(I)V

    .line 107
    .line 108
    .line 109
    const-string v2, "CredentialRequest"

    .line 110
    .line 111
    invoke-direct {v0, v2, v3, v1}, Ldefpackage/p94;-><init>(Ljava/lang/String;ZLdefpackage/wf1;)V

    .line 112
    .line 113
    .line 114
    sput-object v0, Ldefpackage/zz1;->m:Ldefpackage/p94;

    .line 115
    .line 116
    return-void
.end method

.method public static final A(Ldefpackage/ey1;Ldefpackage/hb3;Ldefpackage/dy1;Z)J
    .locals 8

    .line 1
    iget-wide v0, p0, Ldefpackage/ey1;->g:J

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    iget v2, p2, Ldefpackage/dy1;->a:I

    .line 7
    .line 8
    const-wide v3, 0xffffffffL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    const/16 v5, 0x20

    .line 14
    .line 15
    const/4 v6, 0x1

    .line 16
    if-ne v2, v6, :cond_1

    .line 17
    .line 18
    shr-long/2addr v0, v5

    .line 19
    long-to-int v0, v0

    .line 20
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v6, 0x2

    .line 26
    if-ne v2, v6, :cond_3

    .line 27
    .line 28
    and-long/2addr v0, v3

    .line 29
    long-to-int v0, v0

    .line 30
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    :goto_0
    sget-object v1, Ldefpackage/hb3;->o:Ldefpackage/hb3;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    if-ne p1, v1, :cond_2

    .line 38
    .line 39
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    int-to-long v0, v0

    .line 44
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    int-to-long v6, v2

    .line 49
    shl-long/2addr v0, v5

    .line 50
    :goto_1
    and-long v2, v6, v3

    .line 51
    .line 52
    or-long/2addr v0, v2

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    int-to-long v1, v1

    .line 59
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    int-to-long v6, v0

    .line 64
    shl-long v0, v1, v5

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    :goto_2
    invoke-static {p0, p1, p2}, Ldefpackage/zz1;->B(Ldefpackage/ey1;Ldefpackage/hb3;Ldefpackage/dy1;)J

    .line 68
    .line 69
    .line 70
    move-result-wide p1

    .line 71
    invoke-static {p1, p2, v0, v1}, Ldefpackage/g83;->d(JJ)J

    .line 72
    .line 73
    .line 74
    move-result-wide p1

    .line 75
    if-nez p3, :cond_4

    .line 76
    .line 77
    iget-boolean p0, p0, Ldefpackage/ey1;->i:Z

    .line 78
    .line 79
    if-eqz p0, :cond_4

    .line 80
    .line 81
    const-wide/16 p0, 0x0

    .line 82
    .line 83
    return-wide p0

    .line 84
    :cond_4
    return-wide p1
.end method

.method public static final B(Ldefpackage/ey1;Ldefpackage/hb3;Ldefpackage/dy1;)J
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-wide p0, p0, Ldefpackage/ey1;->c:J

    .line 4
    .line 5
    return-wide p0

    .line 6
    :cond_0
    iget p2, p2, Ldefpackage/dy1;->a:I

    .line 7
    .line 8
    const-wide v0, 0xffffffffL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    const/16 v2, 0x20

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    if-ne p2, v3, :cond_1

    .line 17
    .line 18
    iget-wide v3, p0, Ldefpackage/ey1;->c:J

    .line 19
    .line 20
    shr-long/2addr v3, v2

    .line 21
    long-to-int p0, v3

    .line 22
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v3, 0x2

    .line 28
    if-ne p2, v3, :cond_3

    .line 29
    .line 30
    iget-wide v3, p0, Ldefpackage/ey1;->c:J

    .line 31
    .line 32
    and-long/2addr v3, v0

    .line 33
    long-to-int p0, v3

    .line 34
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    :goto_0
    sget-object p2, Ldefpackage/hb3;->o:Ldefpackage/hb3;

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    if-ne p1, p2, :cond_2

    .line 42
    .line 43
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    int-to-long p0, p0

    .line 48
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    int-to-long v3, p2

    .line 53
    shl-long/2addr p0, v2

    .line 54
    :goto_1
    and-long/2addr v0, v3

    .line 55
    or-long/2addr p0, v0

    .line 56
    return-wide p0

    .line 57
    :cond_2
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    int-to-long p1, p1

    .line 62
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    int-to-long v3, p0

    .line 67
    shl-long p0, p1, v2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    iget-wide p0, p0, Ldefpackage/ey1;->c:J

    .line 71
    .line 72
    return-wide p0
.end method

.method public static C(Ldefpackage/be3;ZZ)Ldefpackage/c05;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    const/4 p1, 0x3

    .line 5
    invoke-static {p1, p0, v0}, Ldefpackage/zz1;->N(ILdefpackage/be3;Z)Z

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0}, Ldefpackage/be3;->r()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    long-to-int p1, v1

    .line 13
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 14
    .line 15
    invoke-virtual {p0, p1, v1}, Ldefpackage/be3;->y(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Ldefpackage/be3;->r()J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    long-to-int p1, v1

    .line 23
    new-array p1, p1, [Ljava/lang/String;

    .line 24
    .line 25
    :goto_0
    int-to-long v3, v0

    .line 26
    cmp-long v3, v3, v1

    .line 27
    .line 28
    if-gez v3, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Ldefpackage/be3;->r()J

    .line 31
    .line 32
    .line 33
    move-result-wide v3

    .line 34
    long-to-int v3, v3

    .line 35
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 36
    .line 37
    invoke-virtual {p0, v3, v4}, Ldefpackage/be3;->y(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    aput-object v3, p1, v0

    .line 42
    .line 43
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    if-eqz p2, :cond_3

    .line 47
    .line 48
    invoke-virtual {p0}, Ldefpackage/be3;->A()I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    and-int/lit8 p0, p0, 0x1

    .line 53
    .line 54
    if-eqz p0, :cond_2

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    const-string p0, "framing bit expected to be set"

    .line 58
    .line 59
    const/4 p1, 0x0

    .line 60
    invoke-static {p1, p0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    throw p0

    .line 65
    :cond_3
    :goto_1
    new-instance p0, Ldefpackage/c05;

    .line 66
    .line 67
    invoke-direct {p0, p1}, Ldefpackage/c05;-><init>(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    return-object p0
.end method

.method public static D(Landroid/content/Context;I)Landroid/util/TypedValue;
    .locals 2

    .line 1
    new-instance v0, Landroid/util/TypedValue;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-virtual {p0, p1, v0, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method

.method public static E(Landroid/content/Context;IZ)Z
    .locals 1

    .line 1
    invoke-static {p0, p1}, Ldefpackage/zz1;->D(Landroid/content/Context;I)Landroid/util/TypedValue;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    iget p1, p0, Landroid/util/TypedValue;->type:I

    .line 8
    .line 9
    const/16 v0, 0x12

    .line 10
    .line 11
    if-ne p1, v0, :cond_1

    .line 12
    .line 13
    iget p0, p0, Landroid/util/TypedValue;->data:I

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0

    .line 21
    :cond_1
    return p2
.end method

.method public static F(ILandroid/content/Context;Ljava/lang/String;)Landroid/util/TypedValue;
    .locals 1

    .line 1
    invoke-static {p1, p0}, Ldefpackage/zz1;->D(Landroid/content/Context;I)Landroid/util/TypedValue;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1, p0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    filled-new-array {p2, p0}, [Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const-string p1, "%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant)."

    .line 23
    .line 24
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0
.end method

.method public static final G(I)I
    .locals 2

    .line 1
    const/high16 v0, -0x1000000

    .line 2
    .line 3
    and-int/2addr v0, p0

    .line 4
    ushr-int/lit8 v0, v0, 0x18

    .line 5
    .line 6
    const/high16 v1, 0xff0000

    .line 7
    .line 8
    and-int/2addr v1, p0

    .line 9
    ushr-int/lit8 v1, v1, 0x8

    .line 10
    .line 11
    or-int/2addr v0, v1

    .line 12
    const v1, 0xff00

    .line 13
    .line 14
    .line 15
    and-int/2addr v1, p0

    .line 16
    shl-int/lit8 v1, v1, 0x8

    .line 17
    .line 18
    or-int/2addr v0, v1

    .line 19
    and-int/lit16 p0, p0, 0xff

    .line 20
    .line 21
    shl-int/lit8 p0, p0, 0x18

    .line 22
    .line 23
    or-int/2addr p0, v0

    .line 24
    return p0
.end method

.method public static final H(Ldefpackage/ba1;Ldefpackage/ba1;ILdefpackage/dd0;)Z
    .locals 12

    .line 1
    invoke-virtual {p0}, Ldefpackage/ba1;->v0()Ldefpackage/z91;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ldefpackage/z91;->o:Ldefpackage/z91;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne v0, v1, :cond_24

    .line 9
    .line 10
    const/16 v0, 0x10

    .line 11
    .line 12
    new-array v1, v0, [Ldefpackage/ba1;

    .line 13
    .line 14
    iget-object v3, p0, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 15
    .line 16
    iget-boolean v3, v3, Ldefpackage/cx2;->A:Z

    .line 17
    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    const-string v3, "visitChildren called on an unattached node"

    .line 21
    .line 22
    invoke-static {v3}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    new-instance v3, Ldefpackage/f13;

    .line 26
    .line 27
    new-array v4, v0, [Ldefpackage/cx2;

    .line 28
    .line 29
    invoke-direct {v3, v4}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object v4, p0, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 33
    .line 34
    iget-object v5, v4, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 35
    .line 36
    if-nez v5, :cond_1

    .line 37
    .line 38
    invoke-static {v3, v4}, Ldefpackage/j51;->b(Ldefpackage/f13;Ldefpackage/cx2;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    move v4, v2

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {v3, v5}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    :goto_1
    iget v5, v3, Ldefpackage/f13;->p:I

    .line 48
    .line 49
    const/4 v6, 0x0

    .line 50
    const/4 v7, 0x1

    .line 51
    if-eqz v5, :cond_d

    .line 52
    .line 53
    add-int/lit8 v5, v5, -0x1

    .line 54
    .line 55
    invoke-virtual {v3, v5}, Ldefpackage/f13;->k(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    check-cast v5, Ldefpackage/cx2;

    .line 60
    .line 61
    iget v8, v5, Ldefpackage/cx2;->q:I

    .line 62
    .line 63
    and-int/lit16 v8, v8, 0x400

    .line 64
    .line 65
    if-nez v8, :cond_3

    .line 66
    .line 67
    invoke-static {v3, v5}, Ldefpackage/j51;->b(Ldefpackage/f13;Ldefpackage/cx2;)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    :goto_2
    if-eqz v5, :cond_2

    .line 72
    .line 73
    iget v8, v5, Ldefpackage/cx2;->p:I

    .line 74
    .line 75
    and-int/lit16 v8, v8, 0x400

    .line 76
    .line 77
    if-eqz v8, :cond_c

    .line 78
    .line 79
    move-object v8, v6

    .line 80
    :goto_3
    if-eqz v5, :cond_2

    .line 81
    .line 82
    instance-of v9, v5, Ldefpackage/ba1;

    .line 83
    .line 84
    if-eqz v9, :cond_5

    .line 85
    .line 86
    check-cast v5, Ldefpackage/ba1;

    .line 87
    .line 88
    add-int/lit8 v9, v4, 0x1

    .line 89
    .line 90
    array-length v10, v1

    .line 91
    if-ge v10, v9, :cond_4

    .line 92
    .line 93
    array-length v10, v1

    .line 94
    mul-int/lit8 v11, v10, 0x2

    .line 95
    .line 96
    invoke-static {v9, v11}, Ljava/lang/Math;->max(II)I

    .line 97
    .line 98
    .line 99
    move-result v11

    .line 100
    new-array v11, v11, [Ljava/lang/Object;

    .line 101
    .line 102
    invoke-static {v1, v2, v11, v2, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 103
    .line 104
    .line 105
    move-object v1, v11

    .line 106
    :cond_4
    aput-object v5, v1, v4

    .line 107
    .line 108
    move v4, v9

    .line 109
    goto :goto_6

    .line 110
    :cond_5
    iget v9, v5, Ldefpackage/cx2;->p:I

    .line 111
    .line 112
    and-int/lit16 v9, v9, 0x400

    .line 113
    .line 114
    if-eqz v9, :cond_b

    .line 115
    .line 116
    instance-of v9, v5, Ldefpackage/fo0;

    .line 117
    .line 118
    if-eqz v9, :cond_b

    .line 119
    .line 120
    move-object v9, v5

    .line 121
    check-cast v9, Ldefpackage/fo0;

    .line 122
    .line 123
    iget-object v9, v9, Ldefpackage/fo0;->C:Ldefpackage/cx2;

    .line 124
    .line 125
    move v10, v2

    .line 126
    :goto_4
    if-eqz v9, :cond_a

    .line 127
    .line 128
    iget v11, v9, Ldefpackage/cx2;->p:I

    .line 129
    .line 130
    and-int/lit16 v11, v11, 0x400

    .line 131
    .line 132
    if-eqz v11, :cond_9

    .line 133
    .line 134
    add-int/lit8 v10, v10, 0x1

    .line 135
    .line 136
    if-ne v10, v7, :cond_6

    .line 137
    .line 138
    move-object v5, v9

    .line 139
    goto :goto_5

    .line 140
    :cond_6
    if-nez v8, :cond_7

    .line 141
    .line 142
    new-instance v8, Ldefpackage/f13;

    .line 143
    .line 144
    new-array v11, v0, [Ldefpackage/cx2;

    .line 145
    .line 146
    invoke-direct {v8, v11}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    :cond_7
    if-eqz v5, :cond_8

    .line 150
    .line 151
    invoke-virtual {v8, v5}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    move-object v5, v6

    .line 155
    :cond_8
    invoke-virtual {v8, v9}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    :cond_9
    :goto_5
    iget-object v9, v9, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_a
    if-ne v10, v7, :cond_b

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_b
    :goto_6
    invoke-static {v8}, Ldefpackage/j51;->c(Ldefpackage/f13;)Ldefpackage/cx2;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    goto :goto_3

    .line 169
    :cond_c
    iget-object v5, v5, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_d
    sget-object v3, Ldefpackage/ca1;->o:Ldefpackage/ca1;

    .line 173
    .line 174
    invoke-static {v1, v2, v4, v3}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    .line 175
    .line 176
    .line 177
    if-ne p2, v7, :cond_10

    .line 178
    .line 179
    invoke-static {v2, v4}, Ldefpackage/gb;->g0(II)Ldefpackage/j02;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    iget v4, v3, Ldefpackage/h02;->n:I

    .line 184
    .line 185
    iget v3, v3, Ldefpackage/h02;->o:I

    .line 186
    .line 187
    if-gt v4, v3, :cond_13

    .line 188
    .line 189
    move v5, v2

    .line 190
    :goto_7
    if-eqz v5, :cond_e

    .line 191
    .line 192
    aget-object v8, v1, v4

    .line 193
    .line 194
    check-cast v8, Ldefpackage/ba1;

    .line 195
    .line 196
    invoke-static {v8}, Ldefpackage/te5;->B(Ldefpackage/ba1;)Z

    .line 197
    .line 198
    .line 199
    move-result v9

    .line 200
    if-eqz v9, :cond_e

    .line 201
    .line 202
    invoke-static {v8, p3}, Ldefpackage/zz1;->o(Ldefpackage/ba1;Ldefpackage/dd0;)Z

    .line 203
    .line 204
    .line 205
    move-result v8

    .line 206
    if-eqz v8, :cond_e

    .line 207
    .line 208
    goto :goto_9

    .line 209
    :cond_e
    aget-object v8, v1, v4

    .line 210
    .line 211
    invoke-static {v8, p1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v8

    .line 215
    if-eqz v8, :cond_f

    .line 216
    .line 217
    move v5, v7

    .line 218
    :cond_f
    if-eq v4, v3, :cond_13

    .line 219
    .line 220
    add-int/lit8 v4, v4, 0x1

    .line 221
    .line 222
    goto :goto_7

    .line 223
    :cond_10
    const/4 v3, 0x2

    .line 224
    if-ne p2, v3, :cond_23

    .line 225
    .line 226
    invoke-static {v2, v4}, Ldefpackage/gb;->g0(II)Ldefpackage/j02;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    iget v4, v3, Ldefpackage/h02;->n:I

    .line 231
    .line 232
    iget v3, v3, Ldefpackage/h02;->o:I

    .line 233
    .line 234
    if-gt v4, v3, :cond_13

    .line 235
    .line 236
    move v5, v2

    .line 237
    :goto_8
    if-eqz v5, :cond_11

    .line 238
    .line 239
    aget-object v8, v1, v3

    .line 240
    .line 241
    check-cast v8, Ldefpackage/ba1;

    .line 242
    .line 243
    invoke-static {v8}, Ldefpackage/te5;->B(Ldefpackage/ba1;)Z

    .line 244
    .line 245
    .line 246
    move-result v9

    .line 247
    if-eqz v9, :cond_11

    .line 248
    .line 249
    invoke-static {v8, p3}, Ldefpackage/zz1;->f(Ldefpackage/ba1;Ldefpackage/dd0;)Z

    .line 250
    .line 251
    .line 252
    move-result v8

    .line 253
    if-eqz v8, :cond_11

    .line 254
    .line 255
    :goto_9
    return v7

    .line 256
    :cond_11
    aget-object v8, v1, v3

    .line 257
    .line 258
    invoke-static {v8, p1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v8

    .line 262
    if-eqz v8, :cond_12

    .line 263
    .line 264
    move v5, v7

    .line 265
    :cond_12
    if-eq v3, v4, :cond_13

    .line 266
    .line 267
    add-int/lit8 v3, v3, -0x1

    .line 268
    .line 269
    goto :goto_8

    .line 270
    :cond_13
    if-ne p2, v7, :cond_14

    .line 271
    .line 272
    goto/16 :goto_10

    .line 273
    .line 274
    :cond_14
    invoke-virtual {p0}, Ldefpackage/ba1;->s0()Ldefpackage/x91;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    iget-boolean p1, p1, Ldefpackage/x91;->a:Z

    .line 279
    .line 280
    if-eqz p1, :cond_22

    .line 281
    .line 282
    iget-object p1, p0, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 283
    .line 284
    iget-boolean p1, p1, Ldefpackage/cx2;->A:Z

    .line 285
    .line 286
    if-nez p1, :cond_15

    .line 287
    .line 288
    const-string p1, "visitAncestors called on an unattached node"

    .line 289
    .line 290
    invoke-static {p1}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    :cond_15
    iget-object p1, p0, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 294
    .line 295
    iget-object p1, p1, Ldefpackage/cx2;->r:Ldefpackage/cx2;

    .line 296
    .line 297
    invoke-static {p0}, Ldefpackage/j51;->O(Ldefpackage/eo0;)Ldefpackage/c72;

    .line 298
    .line 299
    .line 300
    move-result-object p2

    .line 301
    :goto_a
    if-eqz p2, :cond_20

    .line 302
    .line 303
    iget-object v1, p2, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 304
    .line 305
    iget-object v1, v1, Ldefpackage/w12;->g:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v1, Ldefpackage/cx2;

    .line 308
    .line 309
    iget v1, v1, Ldefpackage/cx2;->q:I

    .line 310
    .line 311
    and-int/lit16 v1, v1, 0x400

    .line 312
    .line 313
    if-eqz v1, :cond_1e

    .line 314
    .line 315
    :goto_b
    if-eqz p1, :cond_1e

    .line 316
    .line 317
    iget v1, p1, Ldefpackage/cx2;->p:I

    .line 318
    .line 319
    and-int/lit16 v1, v1, 0x400

    .line 320
    .line 321
    if-eqz v1, :cond_1d

    .line 322
    .line 323
    move-object v1, p1

    .line 324
    move-object v3, v6

    .line 325
    :goto_c
    if-eqz v1, :cond_1d

    .line 326
    .line 327
    instance-of v4, v1, Ldefpackage/ba1;

    .line 328
    .line 329
    if-eqz v4, :cond_16

    .line 330
    .line 331
    move-object v6, v1

    .line 332
    goto :goto_f

    .line 333
    :cond_16
    iget v4, v1, Ldefpackage/cx2;->p:I

    .line 334
    .line 335
    and-int/lit16 v4, v4, 0x400

    .line 336
    .line 337
    if-eqz v4, :cond_1c

    .line 338
    .line 339
    instance-of v4, v1, Ldefpackage/fo0;

    .line 340
    .line 341
    if-eqz v4, :cond_1c

    .line 342
    .line 343
    move-object v4, v1

    .line 344
    check-cast v4, Ldefpackage/fo0;

    .line 345
    .line 346
    iget-object v4, v4, Ldefpackage/fo0;->C:Ldefpackage/cx2;

    .line 347
    .line 348
    move v5, v2

    .line 349
    :goto_d
    if-eqz v4, :cond_1b

    .line 350
    .line 351
    iget v8, v4, Ldefpackage/cx2;->p:I

    .line 352
    .line 353
    and-int/lit16 v8, v8, 0x400

    .line 354
    .line 355
    if-eqz v8, :cond_1a

    .line 356
    .line 357
    add-int/lit8 v5, v5, 0x1

    .line 358
    .line 359
    if-ne v5, v7, :cond_17

    .line 360
    .line 361
    move-object v1, v4

    .line 362
    goto :goto_e

    .line 363
    :cond_17
    if-nez v3, :cond_18

    .line 364
    .line 365
    new-instance v3, Ldefpackage/f13;

    .line 366
    .line 367
    new-array v8, v0, [Ldefpackage/cx2;

    .line 368
    .line 369
    invoke-direct {v3, v8}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    :cond_18
    if-eqz v1, :cond_19

    .line 373
    .line 374
    invoke-virtual {v3, v1}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    move-object v1, v6

    .line 378
    :cond_19
    invoke-virtual {v3, v4}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    :cond_1a
    :goto_e
    iget-object v4, v4, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 382
    .line 383
    goto :goto_d

    .line 384
    :cond_1b
    if-ne v5, v7, :cond_1c

    .line 385
    .line 386
    goto :goto_c

    .line 387
    :cond_1c
    invoke-static {v3}, Ldefpackage/j51;->c(Ldefpackage/f13;)Ldefpackage/cx2;

    .line 388
    .line 389
    .line 390
    move-result-object v1

    .line 391
    goto :goto_c

    .line 392
    :cond_1d
    iget-object p1, p1, Ldefpackage/cx2;->r:Ldefpackage/cx2;

    .line 393
    .line 394
    goto :goto_b

    .line 395
    :cond_1e
    invoke-virtual {p2}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 396
    .line 397
    .line 398
    move-result-object p2

    .line 399
    if-eqz p2, :cond_1f

    .line 400
    .line 401
    iget-object p1, p2, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 402
    .line 403
    if-eqz p1, :cond_1f

    .line 404
    .line 405
    iget-object p1, p1, Ldefpackage/w12;->f:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast p1, Ldefpackage/sq4;

    .line 408
    .line 409
    goto :goto_a

    .line 410
    :cond_1f
    move-object p1, v6

    .line 411
    goto :goto_a

    .line 412
    :cond_20
    :goto_f
    if-nez v6, :cond_21

    .line 413
    .line 414
    goto :goto_10

    .line 415
    :cond_21
    invoke-virtual {p3, p0}, Ldefpackage/dd0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object p0

    .line 419
    check-cast p0, Ljava/lang/Boolean;

    .line 420
    .line 421
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 422
    .line 423
    .line 424
    move-result p0

    .line 425
    return p0

    .line 426
    :cond_22
    :goto_10
    return v2

    .line 427
    :cond_23
    const-string p0, "This function should only be used for 1-D focus search"

    .line 428
    .line 429
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    return v2

    .line 433
    :cond_24
    const-string p0, "This function should only be used within a parent that has focus."

    .line 434
    .line 435
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    return v2
.end method

.method public static final I(Ljava/util/Collection;)[Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sget-object v1, Ldefpackage/zz1;->c:[Ljava/lang/Object;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return-object v1

    .line 13
    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    return-object v1

    .line 24
    :cond_1
    new-array v0, v0, [Ljava/lang/Object;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    :goto_0
    add-int/lit8 v2, v1, 0x1

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    aput-object v3, v0, v1

    .line 34
    .line 35
    array-length v1, v0

    .line 36
    if-lt v2, v1, :cond_6

    .line 37
    .line 38
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_2

    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_2
    mul-int/lit8 v1, v2, 0x3

    .line 46
    .line 47
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    ushr-int/lit8 v1, v1, 0x1

    .line 50
    .line 51
    if-gt v1, v2, :cond_4

    .line 52
    .line 53
    const v1, 0x7ffffffd

    .line 54
    .line 55
    .line 56
    if-ge v2, v1, :cond_3

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    new-instance p0, Ljava/lang/OutOfMemoryError;

    .line 60
    .line 61
    invoke-direct {p0}, Ljava/lang/OutOfMemoryError;-><init>()V

    .line 62
    .line 63
    .line 64
    throw p0

    .line 65
    :cond_4
    :goto_1
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    :cond_5
    move v1, v2

    .line 70
    goto :goto_0

    .line 71
    :cond_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-nez v1, :cond_5

    .line 76
    .line 77
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0
.end method

.method public static final J(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    array-length p0, p1

    .line 16
    if-lez p0, :cond_1

    .line 17
    .line 18
    aput-object v1, p1, v2

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-nez v3, :cond_2

    .line 30
    .line 31
    array-length p0, p1

    .line 32
    if-lez p0, :cond_1

    .line 33
    .line 34
    aput-object v1, p1, v2

    .line 35
    .line 36
    :cond_1
    return-object p1

    .line 37
    :cond_2
    array-length v3, p1

    .line 38
    if-gt v0, v3, :cond_3

    .line 39
    .line 40
    move-object v0, p1

    .line 41
    goto :goto_0

    .line 42
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v3}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-static {v3, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    check-cast v0, [Ljava/lang/Object;

    .line 58
    .line 59
    :goto_0
    add-int/lit8 v3, v2, 0x1

    .line 60
    .line 61
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    aput-object v4, v0, v2

    .line 66
    .line 67
    array-length v2, v0

    .line 68
    if-lt v3, v2, :cond_8

    .line 69
    .line 70
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_4

    .line 75
    .line 76
    return-object v0

    .line 77
    :cond_4
    mul-int/lit8 v2, v3, 0x3

    .line 78
    .line 79
    add-int/lit8 v2, v2, 0x1

    .line 80
    .line 81
    ushr-int/lit8 v2, v2, 0x1

    .line 82
    .line 83
    if-gt v2, v3, :cond_6

    .line 84
    .line 85
    const v2, 0x7ffffffd

    .line 86
    .line 87
    .line 88
    if-ge v3, v2, :cond_5

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_5
    new-instance p0, Ljava/lang/OutOfMemoryError;

    .line 92
    .line 93
    invoke-direct {p0}, Ljava/lang/OutOfMemoryError;-><init>()V

    .line 94
    .line 95
    .line 96
    throw p0

    .line 97
    :cond_6
    :goto_1
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    :cond_7
    move v2, v3

    .line 102
    goto :goto_0

    .line 103
    :cond_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-nez v2, :cond_7

    .line 108
    .line 109
    if-ne v0, p1, :cond_9

    .line 110
    .line 111
    aput-object v1, p1, v3

    .line 112
    .line 113
    return-object p1

    .line 114
    :cond_9
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    return-object p0
.end method

.method public static final K(B)Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Ldefpackage/e35;->d:[C

    .line 2
    .line 3
    shr-int/lit8 v1, p0, 0x4

    .line 4
    .line 5
    and-int/lit8 v1, v1, 0xf

    .line 6
    .line 7
    aget-char v1, v0, v1

    .line 8
    .line 9
    and-int/lit8 p0, p0, 0xf

    .line 10
    .line 11
    aget-char p0, v0, p0

    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    new-array v0, v0, [C

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    aput-char v1, v0, v2

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    aput-char p0, v0, v1

    .line 21
    .line 22
    new-instance p0, Ljava/lang/String;

    .line 23
    .line 24
    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method public static final L(I)Ljava/lang/String;
    .locals 10

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, "0"

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    sget-object v0, Ldefpackage/e35;->d:[C

    .line 7
    .line 8
    shr-int/lit8 v1, p0, 0x1c

    .line 9
    .line 10
    and-int/lit8 v1, v1, 0xf

    .line 11
    .line 12
    aget-char v1, v0, v1

    .line 13
    .line 14
    shr-int/lit8 v2, p0, 0x18

    .line 15
    .line 16
    and-int/lit8 v2, v2, 0xf

    .line 17
    .line 18
    aget-char v2, v0, v2

    .line 19
    .line 20
    shr-int/lit8 v3, p0, 0x14

    .line 21
    .line 22
    and-int/lit8 v3, v3, 0xf

    .line 23
    .line 24
    aget-char v3, v0, v3

    .line 25
    .line 26
    shr-int/lit8 v4, p0, 0x10

    .line 27
    .line 28
    and-int/lit8 v4, v4, 0xf

    .line 29
    .line 30
    aget-char v4, v0, v4

    .line 31
    .line 32
    shr-int/lit8 v5, p0, 0xc

    .line 33
    .line 34
    and-int/lit8 v5, v5, 0xf

    .line 35
    .line 36
    aget-char v5, v0, v5

    .line 37
    .line 38
    shr-int/lit8 v6, p0, 0x8

    .line 39
    .line 40
    and-int/lit8 v6, v6, 0xf

    .line 41
    .line 42
    aget-char v6, v0, v6

    .line 43
    .line 44
    shr-int/lit8 v7, p0, 0x4

    .line 45
    .line 46
    and-int/lit8 v7, v7, 0xf

    .line 47
    .line 48
    aget-char v7, v0, v7

    .line 49
    .line 50
    and-int/lit8 p0, p0, 0xf

    .line 51
    .line 52
    aget-char p0, v0, p0

    .line 53
    .line 54
    const/16 v0, 0x8

    .line 55
    .line 56
    new-array v8, v0, [C

    .line 57
    .line 58
    const/4 v9, 0x0

    .line 59
    aput-char v1, v8, v9

    .line 60
    .line 61
    const/4 v1, 0x1

    .line 62
    aput-char v2, v8, v1

    .line 63
    .line 64
    const/4 v1, 0x2

    .line 65
    aput-char v3, v8, v1

    .line 66
    .line 67
    const/4 v1, 0x3

    .line 68
    aput-char v4, v8, v1

    .line 69
    .line 70
    const/4 v1, 0x4

    .line 71
    aput-char v5, v8, v1

    .line 72
    .line 73
    const/4 v1, 0x5

    .line 74
    aput-char v6, v8, v1

    .line 75
    .line 76
    const/4 v1, 0x6

    .line 77
    aput-char v7, v8, v1

    .line 78
    .line 79
    const/4 v1, 0x7

    .line 80
    aput-char p0, v8, v1

    .line 81
    .line 82
    :goto_0
    if-ge v9, v0, :cond_1

    .line 83
    .line 84
    aget-char p0, v8, v9

    .line 85
    .line 86
    const/16 v1, 0x30

    .line 87
    .line 88
    if-ne p0, v1, :cond_1

    .line 89
    .line 90
    add-int/lit8 v9, v9, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_1
    const/4 p0, 0x0

    .line 94
    const-string v1, "startIndex: "

    .line 95
    .line 96
    if-ltz v9, :cond_3

    .line 97
    .line 98
    if-gt v9, v0, :cond_2

    .line 99
    .line 100
    new-instance p0, Ljava/lang/String;

    .line 101
    .line 102
    rsub-int/lit8 v0, v9, 0x8

    .line 103
    .line 104
    invoke-direct {p0, v8, v9, v0}, Ljava/lang/String;-><init>([CII)V

    .line 105
    .line 106
    .line 107
    return-object p0

    .line 108
    :cond_2
    const-string v0, " > endIndex: 8"

    .line 109
    .line 110
    invoke-static {v9, v1, v0}, Ldefpackage/b11;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-static {v0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return-object p0

    .line 118
    :cond_3
    const-string v0, ", endIndex: 8, size: 8"

    .line 119
    .line 120
    invoke-static {v9, v1, v0}, Ldefpackage/b11;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-static {v0}, Ldefpackage/kf2;->h(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    return-object p0
.end method

.method public static final M(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p0, Ldefpackage/nx1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Ldefpackage/nx1;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-eqz v0, :cond_2

    .line 11
    .line 12
    iget-object v0, v0, Ldefpackage/nx1;->a:Ldefpackage/mx1;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    return-object v0

    .line 18
    :cond_2
    :goto_1
    return-object p0
.end method

.method public static N(ILdefpackage/be3;Z)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Ldefpackage/be3;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x7

    .line 6
    const/4 v2, 0x0

    .line 7
    if-ge v0, v1, :cond_1

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string p2, "too short header: "

    .line 15
    .line 16
    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Ldefpackage/be3;->a()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {v2, p0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    throw p0

    .line 35
    :cond_1
    invoke-virtual {p1}, Ldefpackage/be3;->A()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eq v0, p0, :cond_3

    .line 40
    .line 41
    if-eqz p2, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string p2, "expected header type "

    .line 47
    .line 48
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {v2, p0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    throw p0

    .line 67
    :cond_3
    invoke-virtual {p1}, Ldefpackage/be3;->A()I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    const/16 v0, 0x76

    .line 72
    .line 73
    if-ne p0, v0, :cond_5

    .line 74
    .line 75
    invoke-virtual {p1}, Ldefpackage/be3;->A()I

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    const/16 v0, 0x6f

    .line 80
    .line 81
    if-ne p0, v0, :cond_5

    .line 82
    .line 83
    invoke-virtual {p1}, Ldefpackage/be3;->A()I

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    const/16 v0, 0x72

    .line 88
    .line 89
    if-ne p0, v0, :cond_5

    .line 90
    .line 91
    invoke-virtual {p1}, Ldefpackage/be3;->A()I

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    const/16 v0, 0x62

    .line 96
    .line 97
    if-ne p0, v0, :cond_5

    .line 98
    .line 99
    invoke-virtual {p1}, Ldefpackage/be3;->A()I

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    const/16 v0, 0x69

    .line 104
    .line 105
    if-ne p0, v0, :cond_5

    .line 106
    .line 107
    invoke-virtual {p1}, Ldefpackage/be3;->A()I

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    const/16 p1, 0x73

    .line 112
    .line 113
    if-eq p0, p1, :cond_4

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_4
    const/4 p0, 0x1

    .line 117
    return p0

    .line 118
    :cond_5
    :goto_0
    if-eqz p2, :cond_6

    .line 119
    .line 120
    :goto_1
    const/4 p0, 0x0

    .line 121
    return p0

    .line 122
    :cond_6
    const-string p0, "expected characters \'vorbis\'"

    .line 123
    .line 124
    invoke-static {v2, p0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    throw p0
.end method

.method public static final a(Ldefpackage/cf2;Ldefpackage/pp1;)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Ldefpackage/cf2;->d0()Ldefpackage/cf2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v2, "Child of "

    .line 11
    .line 12
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v2, " cannot be null when calculating alignment line"

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {v1}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-virtual {p0}, Ldefpackage/cf2;->h0()Ldefpackage/vi2;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v1}, Ldefpackage/vi2;->a()Ljava/util/Map;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/high16 v2, -0x80000000

    .line 43
    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    invoke-virtual {p0}, Ldefpackage/cf2;->h0()Ldefpackage/vi2;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-interface {p0}, Ldefpackage/vi2;->a()Ljava/util/Map;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, Ljava/lang/Integer;

    .line 59
    .line 60
    if-eqz p0, :cond_2

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    return p0

    .line 67
    :cond_1
    invoke-virtual {v0, p1}, Ldefpackage/cf2;->c0(Ldefpackage/pp1;)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-ne v1, v2, :cond_3

    .line 72
    .line 73
    :cond_2
    return v2

    .line 74
    :cond_3
    iget-boolean v2, p0, Ldefpackage/cf2;->A:Z

    .line 75
    .line 76
    iget-boolean v3, p0, Ldefpackage/cf2;->B:Z

    .line 77
    .line 78
    const/4 v4, 0x1

    .line 79
    iput-boolean v4, v0, Ldefpackage/cf2;->A:Z

    .line 80
    .line 81
    iput-boolean v4, p0, Ldefpackage/cf2;->B:Z

    .line 82
    .line 83
    invoke-virtual {p0}, Ldefpackage/cf2;->n0()V

    .line 84
    .line 85
    .line 86
    iput-boolean v2, v0, Ldefpackage/cf2;->A:Z

    .line 87
    .line 88
    iput-boolean v3, p0, Ldefpackage/cf2;->B:Z

    .line 89
    .line 90
    instance-of p0, p1, Ldefpackage/pp1;

    .line 91
    .line 92
    if-eqz p0, :cond_4

    .line 93
    .line 94
    invoke-virtual {v0}, Ldefpackage/cf2;->j0()J

    .line 95
    .line 96
    .line 97
    move-result-wide p0

    .line 98
    const-wide v2, 0xffffffffL

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    and-long/2addr p0, v2

    .line 104
    :goto_1
    long-to-int p0, p0

    .line 105
    add-int/2addr v1, p0

    .line 106
    return v1

    .line 107
    :cond_4
    invoke-virtual {v0}, Ldefpackage/cf2;->j0()J

    .line 108
    .line 109
    .line 110
    move-result-wide p0

    .line 111
    const/16 v0, 0x20

    .line 112
    .line 113
    shr-long/2addr p0, v0

    .line 114
    goto :goto_1
.end method

.method public static final b(Ldefpackage/ey1;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldefpackage/ey1;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean p0, p0, Ldefpackage/ey1;->d:Z

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static final c(Ljava/util/logging/Logger;Ldefpackage/ar4;Ldefpackage/fr4;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p2, p2, Ldefpackage/fr4;->b:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const/16 p2, 0x20

    .line 12
    .line 13
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const/4 p2, 0x1

    .line 17
    filled-new-array {p3}, [Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    invoke-static {p3, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    const-string p3, "%-22s"

    .line 26
    .line 27
    invoke-static {p3, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p2, ": "

    .line 35
    .line 36
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-object p1, p1, Ldefpackage/ar4;->a:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p0, p1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public static final d(Ldefpackage/ig3;Z[Ldefpackage/rp1;F)F
    .locals 6

    .line 1
    array-length v0, p2

    .line 2
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v3, v0, :cond_3

    .line 7
    .line 8
    aget-object v4, p2, v3

    .line 9
    .line 10
    invoke-virtual {p0, v4}, Ldefpackage/ig3;->b(Ldefpackage/rp1;)F

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    if-nez v5, :cond_1

    .line 19
    .line 20
    cmpl-float v5, v4, v1

    .line 21
    .line 22
    if-lez v5, :cond_0

    .line 23
    .line 24
    const/4 v5, 0x1

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    move v5, v2

    .line 27
    :goto_1
    if-ne p1, v5, :cond_2

    .line 28
    .line 29
    :cond_1
    move v1, v4

    .line 30
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_4

    .line 38
    .line 39
    return p3

    .line 40
    :cond_4
    return v1
.end method

.method public static final e(III[B[B)Z
    .locals 4

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    move v1, v0

    .line 9
    :goto_0
    if-ge v1, p2, :cond_1

    .line 10
    .line 11
    add-int v2, v1, p0

    .line 12
    .line 13
    aget-byte v2, p3, v2

    .line 14
    .line 15
    add-int v3, v1, p1

    .line 16
    .line 17
    aget-byte v3, p4, v3

    .line 18
    .line 19
    if-eq v2, v3, :cond_0

    .line 20
    .line 21
    return v0

    .line 22
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 p0, 0x1

    .line 26
    return p0
.end method

.method public static final f(Ldefpackage/ba1;Ldefpackage/dd0;)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Ldefpackage/ba1;->v0()Ldefpackage/z91;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_9

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x2

    .line 14
    const/4 v4, 0x1

    .line 15
    if-eq v0, v4, :cond_2

    .line 16
    .line 17
    if-eq v0, v3, :cond_9

    .line 18
    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    invoke-static {p0, p1}, Ldefpackage/zz1;->x(Ldefpackage/ba1;Ldefpackage/dd0;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_6

    .line 26
    .line 27
    invoke-virtual {p0}, Ldefpackage/ba1;->s0()Ldefpackage/x91;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-boolean v0, v0, Ldefpackage/x91;->a:Z

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    invoke-virtual {p1, p0}, Ldefpackage/dd0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Ljava/lang/Boolean;

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move p0, v2

    .line 47
    :goto_0
    if-eqz p0, :cond_5

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-static {}, Ldefpackage/er1;->n()V

    .line 51
    .line 52
    .line 53
    return v2

    .line 54
    :cond_2
    invoke-static {p0}, Ldefpackage/te5;->s(Ldefpackage/ba1;)Ldefpackage/ba1;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const-string v5, "ActiveParent must have a focusedChild"

    .line 59
    .line 60
    if-eqz v0, :cond_8

    .line 61
    .line 62
    invoke-virtual {v0}, Ldefpackage/ba1;->v0()Ldefpackage/z91;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-eqz v6, :cond_7

    .line 71
    .line 72
    if-eq v6, v4, :cond_4

    .line 73
    .line 74
    if-eq v6, v3, :cond_7

    .line 75
    .line 76
    if-eq v6, v1, :cond_3

    .line 77
    .line 78
    invoke-static {}, Ldefpackage/er1;->n()V

    .line 79
    .line 80
    .line 81
    return v2

    .line 82
    :cond_3
    invoke-static {v5}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return v2

    .line 86
    :cond_4
    invoke-static {v0, p1}, Ldefpackage/zz1;->f(Ldefpackage/ba1;Ldefpackage/dd0;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-nez v1, :cond_6

    .line 91
    .line 92
    invoke-static {p0, v0, v3, p1}, Ldefpackage/zz1;->p(Ldefpackage/ba1;Ldefpackage/ba1;ILdefpackage/dd0;)Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    if-nez p0, :cond_6

    .line 97
    .line 98
    invoke-virtual {v0}, Ldefpackage/ba1;->s0()Ldefpackage/x91;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    iget-boolean p0, p0, Ldefpackage/x91;->a:Z

    .line 103
    .line 104
    if-eqz p0, :cond_5

    .line 105
    .line 106
    invoke-virtual {p1, v0}, Ldefpackage/dd0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    check-cast p0, Ljava/lang/Boolean;

    .line 111
    .line 112
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    if-eqz p0, :cond_5

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_5
    return v2

    .line 120
    :cond_6
    :goto_1
    return v4

    .line 121
    :cond_7
    invoke-static {p0, v0, v3, p1}, Ldefpackage/zz1;->p(Ldefpackage/ba1;Ldefpackage/ba1;ILdefpackage/dd0;)Z

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    return p0

    .line 126
    :cond_8
    invoke-static {v5}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    return v2

    .line 130
    :cond_9
    invoke-static {p0, p1}, Ldefpackage/zz1;->x(Ldefpackage/ba1;Ldefpackage/dd0;)Z

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    return p0
.end method

.method public static g(F[F)V
    .locals 6

    .line 1
    const/high16 v0, 0x3f000000    # 0.5f

    .line 2
    .line 3
    cmpg-float v0, p0, v0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    const/high16 v3, 0x40000000    # 2.0f

    .line 8
    .line 9
    const/high16 v4, 0x3f800000    # 1.0f

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    if-gtz v0, :cond_0

    .line 13
    .line 14
    mul-float/2addr p0, v3

    .line 15
    sub-float/2addr v4, p0

    .line 16
    aput v4, p1, v5

    .line 17
    .line 18
    aput v1, p1, v2

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    aput v1, p1, v5

    .line 22
    .line 23
    mul-float/2addr p0, v3

    .line 24
    sub-float/2addr p0, v4

    .line 25
    aput p0, p1, v2

    .line 26
    .line 27
    return-void
.end method

.method public static final h(Ldefpackage/ey1;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldefpackage/ey1;->h:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean p0, p0, Ldefpackage/ey1;->d:Z

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static final i(JJJ)V
    .locals 4

    .line 1
    or-long v0, p2, p4

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-ltz v0, :cond_0

    .line 8
    .line 9
    cmp-long v0, p2, p0

    .line 10
    .line 11
    if-gtz v0, :cond_0

    .line 12
    .line 13
    sub-long v0, p0, p2

    .line 14
    .line 15
    cmp-long v0, v0, p4

    .line 16
    .line 17
    if-ltz v0, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 21
    .line 22
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v2, "size="

    .line 25
    .line 26
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p0, " offset="

    .line 33
    .line 34
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string p0, " byteCount="

    .line 41
    .line 42
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-direct {v0, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v0
.end method

.method public static l(IIII)J
    .locals 4

    .line 1
    const v0, 0x3fffe

    .line 2
    .line 3
    .line 4
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    const v1, 0x7fffffff

    .line 9
    .line 10
    .line 11
    if-ne p3, v1, :cond_0

    .line 12
    .line 13
    move p3, v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    :goto_0
    if-ne p3, v1, :cond_1

    .line 20
    .line 21
    move v2, p2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v2, p3

    .line 24
    :goto_1
    const/16 v3, 0x1fff

    .line 25
    .line 26
    if-ge v2, v3, :cond_2

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_2
    const/16 v0, 0x7fff

    .line 30
    .line 31
    if-ge v2, v0, :cond_3

    .line 32
    .line 33
    const v0, 0xfffe

    .line 34
    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_3
    const v0, 0xffff

    .line 38
    .line 39
    .line 40
    if-ge v2, v0, :cond_4

    .line 41
    .line 42
    const/16 v0, 0x7ffe

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_4
    const v0, 0x3ffff

    .line 46
    .line 47
    .line 48
    if-ge v2, v0, :cond_6

    .line 49
    .line 50
    const/16 v0, 0x1ffe

    .line 51
    .line 52
    :goto_2
    if-ne p1, v1, :cond_5

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_5
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    :goto_3
    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    invoke-static {p0, v1, p2, p3}, Ldefpackage/qc0;->a(IIII)J

    .line 64
    .line 65
    .line 66
    move-result-wide p0

    .line 67
    return-wide p0

    .line 68
    :cond_6
    invoke-static {v2}, Ldefpackage/qc0;->i(I)Ljava/lang/Void;

    .line 69
    .line 70
    .line 71
    invoke-static {}, Ldefpackage/er1;->a()V

    .line 72
    .line 73
    .line 74
    const-wide/16 p0, 0x0

    .line 75
    .line 76
    return-wide p0
.end method

.method public static m(IIII)J
    .locals 4

    .line 1
    const v0, 0x3fffe

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, Ljava/lang/Math;->min(II)I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    const v1, 0x7fffffff

    .line 9
    .line 10
    .line 11
    if-ne p1, v1, :cond_0

    .line 12
    .line 13
    move p1, v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    :goto_0
    if-ne p1, v1, :cond_1

    .line 20
    .line 21
    move v2, p0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v2, p1

    .line 24
    :goto_1
    const/16 v3, 0x1fff

    .line 25
    .line 26
    if-ge v2, v3, :cond_2

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_2
    const/16 v0, 0x7fff

    .line 30
    .line 31
    if-ge v2, v0, :cond_3

    .line 32
    .line 33
    const v0, 0xfffe

    .line 34
    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_3
    const v0, 0xffff

    .line 38
    .line 39
    .line 40
    if-ge v2, v0, :cond_4

    .line 41
    .line 42
    const/16 v0, 0x7ffe

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_4
    const v0, 0x3ffff

    .line 46
    .line 47
    .line 48
    if-ge v2, v0, :cond_6

    .line 49
    .line 50
    const/16 v0, 0x1ffe

    .line 51
    .line 52
    :goto_2
    if-ne p3, v1, :cond_5

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_5
    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    :goto_3
    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    invoke-static {p0, p1, p2, v1}, Ldefpackage/qc0;->a(IIII)J

    .line 64
    .line 65
    .line 66
    move-result-wide p0

    .line 67
    return-wide p0

    .line 68
    :cond_6
    invoke-static {v2}, Ldefpackage/qc0;->i(I)Ljava/lang/Void;

    .line 69
    .line 70
    .line 71
    invoke-static {}, Ldefpackage/er1;->a()V

    .line 72
    .line 73
    .line 74
    const-wide/16 p0, 0x0

    .line 75
    .line 76
    return-wide p0
.end method

.method public static final n(J)Ljava/lang/String;
    .locals 18

    .line 1
    const-wide/32 v0, -0x3b9328e0

    .line 2
    .line 3
    .line 4
    cmp-long v0, p0, v0

    .line 5
    .line 6
    const-string v1, " s "

    .line 7
    .line 8
    const-wide/32 v2, 0x3b9aca00

    .line 9
    .line 10
    .line 11
    const-wide/32 v4, 0x1dcd6500

    .line 12
    .line 13
    .line 14
    if-gtz v0, :cond_0

    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    sub-long v4, p0, v4

    .line 22
    .line 23
    div-long/2addr v4, v2

    .line 24
    invoke-static {v0, v4, v5, v1}, Ldefpackage/b11;->p(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const-wide/32 v6, -0xf404c

    .line 30
    .line 31
    .line 32
    cmp-long v0, p0, v6

    .line 33
    .line 34
    const-string v6, " ms"

    .line 35
    .line 36
    const-wide/32 v7, 0xf4240

    .line 37
    .line 38
    .line 39
    const-wide/32 v9, 0x7a120

    .line 40
    .line 41
    .line 42
    if-gtz v0, :cond_1

    .line 43
    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    sub-long v1, p0, v9

    .line 50
    .line 51
    div-long/2addr v1, v7

    .line 52
    invoke-static {v0, v1, v2, v6}, Ldefpackage/b11;->p(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    const-wide/16 v11, 0x0

    .line 58
    .line 59
    cmp-long v0, p0, v11

    .line 60
    .line 61
    const-string v11, " \u00b5s"

    .line 62
    .line 63
    const-wide/16 v12, 0x3e8

    .line 64
    .line 65
    const-wide/16 v14, 0x1f4

    .line 66
    .line 67
    if-gtz v0, :cond_2

    .line 68
    .line 69
    new-instance v0, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    sub-long v1, p0, v14

    .line 75
    .line 76
    div-long/2addr v1, v12

    .line 77
    invoke-static {v0, v1, v2, v11}, Ldefpackage/b11;->p(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    goto :goto_0

    .line 82
    :cond_2
    const-wide/32 v16, 0xf404c

    .line 83
    .line 84
    .line 85
    cmp-long v0, p0, v16

    .line 86
    .line 87
    if-gez v0, :cond_3

    .line 88
    .line 89
    new-instance v0, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    add-long v1, p0, v14

    .line 95
    .line 96
    div-long/2addr v1, v12

    .line 97
    invoke-static {v0, v1, v2, v11}, Ldefpackage/b11;->p(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    goto :goto_0

    .line 102
    :cond_3
    const-wide/32 v11, 0x3b9328e0

    .line 103
    .line 104
    .line 105
    cmp-long v0, p0, v11

    .line 106
    .line 107
    if-gez v0, :cond_4

    .line 108
    .line 109
    new-instance v0, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    .line 113
    .line 114
    add-long v1, p0, v9

    .line 115
    .line 116
    div-long/2addr v1, v7

    .line 117
    invoke-static {v0, v1, v2, v6}, Ldefpackage/b11;->p(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    goto :goto_0

    .line 122
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 125
    .line 126
    .line 127
    add-long v4, p0, v4

    .line 128
    .line 129
    div-long/2addr v4, v2

    .line 130
    invoke-static {v0, v4, v5, v1}, Ldefpackage/b11;->p(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    :goto_0
    const/4 v1, 0x1

    .line 135
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    const-string v1, "%6s"

    .line 144
    .line 145
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    return-object v0
.end method

.method public static final o(Ldefpackage/ba1;Ldefpackage/dd0;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ldefpackage/ba1;->v0()Ldefpackage/z91;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_6

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x1

    .line 13
    if-eq v0, v2, :cond_2

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    if-eq v0, v2, :cond_6

    .line 17
    .line 18
    const/4 v2, 0x3

    .line 19
    if-ne v0, v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Ldefpackage/ba1;->s0()Ldefpackage/x91;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-boolean v0, v0, Ldefpackage/x91;->a:Z

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1, p0}, Ldefpackage/dd0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    return p0

    .line 40
    :cond_0
    invoke-static {p0, p1}, Ldefpackage/zz1;->y(Ldefpackage/ba1;Ldefpackage/dd0;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    return p0

    .line 45
    :cond_1
    invoke-static {}, Ldefpackage/er1;->n()V

    .line 46
    .line 47
    .line 48
    return v1

    .line 49
    :cond_2
    invoke-static {p0}, Ldefpackage/te5;->s(Ldefpackage/ba1;)Ldefpackage/ba1;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-eqz v0, :cond_5

    .line 54
    .line 55
    invoke-static {v0, p1}, Ldefpackage/zz1;->o(Ldefpackage/ba1;Ldefpackage/dd0;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-nez v3, :cond_4

    .line 60
    .line 61
    invoke-static {p0, v0, v2, p1}, Ldefpackage/zz1;->p(Ldefpackage/ba1;Ldefpackage/ba1;ILdefpackage/dd0;)Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-eqz p0, :cond_3

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    return v1

    .line 69
    :cond_4
    :goto_0
    return v2

    .line 70
    :cond_5
    const-string p0, "ActiveParent must have a focusedChild"

    .line 71
    .line 72
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return v1

    .line 76
    :cond_6
    invoke-static {p0, p1}, Ldefpackage/zz1;->y(Ldefpackage/ba1;Ldefpackage/dd0;)Z

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    return p0
.end method

.method public static final p(Ldefpackage/ba1;Ldefpackage/ba1;ILdefpackage/dd0;)Z
    .locals 8

    .line 1
    invoke-static {p0, p1, p2, p3}, Ldefpackage/zz1;->H(Ldefpackage/ba1;Ldefpackage/ba1;ILdefpackage/dd0;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    invoke-static {p0}, Ldefpackage/j51;->P(Ldefpackage/eo0;)Ldefpackage/ub3;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ldefpackage/ra;

    .line 14
    .line 15
    invoke-virtual {v0}, Ldefpackage/ra;->getFocusOwner()Ldefpackage/u91;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ldefpackage/ey;

    .line 20
    .line 21
    invoke-virtual {v0}, Ldefpackage/ey;->f()Ldefpackage/ba1;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    new-instance v1, Ldefpackage/x50;

    .line 26
    .line 27
    const/4 v7, 0x1

    .line 28
    move-object v3, p0

    .line 29
    move-object v4, p1

    .line 30
    move v5, p2

    .line 31
    move-object v6, p3

    .line 32
    invoke-direct/range {v1 .. v7}, Ldefpackage/x50;-><init>(Ldefpackage/ba1;Ldefpackage/ba1;Ljava/lang/Object;ILdefpackage/dd0;I)V

    .line 33
    .line 34
    .line 35
    invoke-static {v3, v5, v1}, Ldefpackage/uc5;->U(Ldefpackage/ba1;ILdefpackage/if1;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Ljava/lang/Boolean;

    .line 40
    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    return p0

    .line 48
    :cond_1
    const/4 p0, 0x0

    .line 49
    return p0
.end method

.method public static q(Ljavax/net/ssl/SSLSession;)Ldefpackage/jl1;
    .locals 6

    .line 1
    sget-object v0, Ldefpackage/u01;->n:Ldefpackage/u01;

    .line 2
    .line 3
    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getCipherSuite()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_6

    .line 9
    .line 10
    const-string v3, "TLS_NULL_WITH_NULL_NULL"

    .line 11
    .line 12
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const/4 v4, 0x1

    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    move v3, v4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-string v3, "SSL_NULL_WITH_NULL_NULL"

    .line 22
    .line 23
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    :goto_0
    if-nez v3, :cond_5

    .line 28
    .line 29
    sget-object v3, Ldefpackage/v20;->b:Ldefpackage/pa;

    .line 30
    .line 31
    invoke-virtual {v3, v1}, Ldefpackage/pa;->u(Ljava/lang/String;)Ldefpackage/v20;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getProtocol()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    if-eqz v3, :cond_4

    .line 40
    .line 41
    const-string v5, "NONE"

    .line 42
    .line 43
    invoke-virtual {v5, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-nez v5, :cond_3

    .line 48
    .line 49
    sget-object v2, Ldefpackage/mu4;->o:Ldefpackage/xi4;

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-static {v3}, Ldefpackage/xi4;->m(Ljava/lang/String;)Ldefpackage/mu4;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    :try_start_0
    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getPeerCertificates()[Ljava/security/cert/Certificate;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    if-eqz v3, :cond_1

    .line 63
    .line 64
    array-length v5, v3

    .line 65
    invoke-static {v3, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-static {v3}, Ldefpackage/ze5;->f([Ljava/lang/Object;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v3
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    goto :goto_1

    .line 74
    :catch_0
    :cond_1
    move-object v3, v0

    .line 75
    :goto_1
    new-instance v5, Ldefpackage/jl1;

    .line 76
    .line 77
    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getLocalCertificates()[Ljava/security/cert/Certificate;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    if-eqz p0, :cond_2

    .line 82
    .line 83
    array-length v0, p0

    .line 84
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {p0}, Ldefpackage/ze5;->f([Ljava/lang/Object;)Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    :cond_2
    new-instance p0, Ldefpackage/hl1;

    .line 93
    .line 94
    invoke-direct {p0, v3, v4}, Ldefpackage/hl1;-><init>(Ljava/util/List;I)V

    .line 95
    .line 96
    .line 97
    invoke-direct {v5, v2, v1, v0, p0}, Ldefpackage/jl1;-><init>(Ldefpackage/mu4;Ldefpackage/v20;Ljava/util/List;Ldefpackage/gf1;)V

    .line 98
    .line 99
    .line 100
    return-object v5

    .line 101
    :cond_3
    const-string p0, "tlsVersion == NONE"

    .line 102
    .line 103
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    return-object v2

    .line 107
    :cond_4
    const-string p0, "tlsVersion == null"

    .line 108
    .line 109
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    return-object v2

    .line 113
    :cond_5
    const-string p0, "cipherSuite == "

    .line 114
    .line 115
    invoke-virtual {p0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    return-object v2

    .line 123
    :cond_6
    const-string p0, "cipherSuite == null"

    .line 124
    .line 125
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    return-object v2
.end method

.method public static r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    invoke-static {}, Ldefpackage/c14;->c()Ldefpackage/c14;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0, p1}, Ldefpackage/c14;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static final s(Ldefpackage/vd0;)Ldefpackage/cz;
    .locals 2

    .line 1
    instance-of v0, p0, Ldefpackage/mr0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ldefpackage/cz;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p0}, Ldefpackage/cz;-><init>(ILdefpackage/vd0;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    move-object v0, p0

    .line 13
    check-cast v0, Ldefpackage/mr0;

    .line 14
    .line 15
    invoke-virtual {v0}, Ldefpackage/mr0;->j()Ldefpackage/cz;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    invoke-virtual {v0}, Ldefpackage/cz;->C()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 v0, 0x0

    .line 29
    :goto_0
    if-nez v0, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    return-object v0

    .line 33
    :cond_3
    :goto_1
    new-instance v0, Ldefpackage/cz;

    .line 34
    .line 35
    const/4 v1, 0x2

    .line 36
    invoke-direct {v0, v1, p0}, Ldefpackage/cz;-><init>(ILdefpackage/vd0;)V

    .line 37
    .line 38
    .line 39
    return-object v0
.end method

.method public static t(Landroid/view/Display;I)Ldefpackage/j34;
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-lt v0, v1, :cond_3

    .line 7
    .line 8
    invoke-static {p0, p1}, Ldefpackage/hd0;->n(Landroid/view/Display;I)Landroid/view/RoundedCorner;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_3

    .line 13
    .line 14
    new-instance p1, Ldefpackage/j34;

    .line 15
    .line 16
    invoke-static {p0}, Ldefpackage/go2;->a(Landroid/view/RoundedCorner;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    if-eq v0, v1, :cond_2

    .line 24
    .line 25
    const/4 v1, 0x2

    .line 26
    if-eq v0, v1, :cond_2

    .line 27
    .line 28
    const/4 v1, 0x3

    .line 29
    if-ne v0, v1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const-string p0, "Invalid position: "

    .line 33
    .line 34
    invoke-static {v0, p0}, Ldefpackage/f34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-object v2

    .line 42
    :cond_1
    const/4 v1, 0x0

    .line 43
    :cond_2
    :goto_0
    invoke-static {p0}, Ldefpackage/go2;->A(Landroid/view/RoundedCorner;)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-static {p0}, Ldefpackage/go2;->b(Landroid/view/RoundedCorner;)Landroid/graphics/Point;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-direct {p1, v1, v0, p0}, Ldefpackage/j34;-><init>(IILandroid/graphics/Point;)V

    .line 52
    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_3
    return-object v2
.end method

.method public static u(Landroid/view/MotionEvent;I)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getSource()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    and-int/2addr p0, p1

    .line 6
    if-ne p0, p1, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public static v(Landroid/content/res/Configuration;Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Ldefpackage/hd0;->a(Landroid/content/res/Configuration;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const v1, 0x7fffffff

    .line 12
    .line 13
    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    invoke-static {p0}, Ldefpackage/hd0;->a(Landroid/content/res/Configuration;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, Ldefpackage/vl4;->a(Landroid/graphics/Typeface;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-static {p0}, Ldefpackage/hd0;->a(Landroid/content/res/Configuration;)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    add-int/2addr p0, v0

    .line 33
    const/4 v0, 0x1

    .line 34
    const/16 v1, 0x3e8

    .line 35
    .line 36
    invoke-static {p0, v0, v1}, Ldefpackage/su3;->l(III)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    invoke-virtual {p1}, Landroid/graphics/Typeface;->isItalic()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-static {p1, p0, v0}, Ldefpackage/sr0;->g(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :cond_0
    const/4 p0, 0x0

    .line 50
    return-object p0
.end method

.method public static w(Ljava/util/List;)Ldefpackage/qv2;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v1

    .line 8
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-ge v2, v3, :cond_2

    .line 13
    .line 14
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, Ljava/lang/String;

    .line 19
    .line 20
    sget-object v4, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 21
    .line 22
    const-string v4, "="

    .line 23
    .line 24
    const/4 v5, 0x2

    .line 25
    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    array-length v6, v4

    .line 30
    const-string v7, "VorbisUtil"

    .line 31
    .line 32
    if-eq v6, v5, :cond_0

    .line 33
    .line 34
    const-string v4, "Failed to parse Vorbis comment: "

    .line 35
    .line 36
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-static {v7, v3}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    aget-object v3, v4, v1

    .line 45
    .line 46
    const-string v5, "METADATA_BLOCK_PICTURE"

    .line 47
    .line 48
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    const/4 v5, 0x1

    .line 53
    if-eqz v3, :cond_1

    .line 54
    .line 55
    :try_start_0
    aget-object v3, v4, v5

    .line 56
    .line 57
    invoke-static {v3, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    new-instance v4, Ldefpackage/be3;

    .line 62
    .line 63
    invoke-direct {v4, v3}, Ldefpackage/be3;-><init>([B)V

    .line 64
    .line 65
    .line 66
    invoke-static {v4}, Ldefpackage/dg3;->d(Ldefpackage/be3;)Ldefpackage/dg3;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :catch_0
    move-exception v3

    .line 75
    const-string v4, "Failed to parse vorbis picture"

    .line 76
    .line 77
    invoke-static {v7, v4, v3}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    new-instance v3, Ldefpackage/r85;

    .line 82
    .line 83
    aget-object v6, v4, v1

    .line 84
    .line 85
    aget-object v4, v4, v5

    .line 86
    .line 87
    invoke-direct {v3, v6, v4}, Ldefpackage/r85;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    if-eqz p0, :cond_3

    .line 101
    .line 102
    const/4 p0, 0x0

    .line 103
    goto :goto_2

    .line 104
    :cond_3
    new-instance p0, Ldefpackage/qv2;

    .line 105
    .line 106
    invoke-direct {p0, v0}, Ldefpackage/qv2;-><init>(Ljava/util/List;)V

    .line 107
    .line 108
    .line 109
    :goto_2
    return-object p0
.end method

.method public static final x(Ldefpackage/ba1;Ldefpackage/dd0;)Z
    .locals 11

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v1, v0, [Ldefpackage/ba1;

    .line 4
    .line 5
    iget-object v2, p0, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 6
    .line 7
    iget-boolean v2, v2, Ldefpackage/cx2;->A:Z

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    const-string v2, "visitChildren called on an unattached node"

    .line 12
    .line 13
    invoke-static {v2}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    new-instance v2, Ldefpackage/f13;

    .line 17
    .line 18
    new-array v3, v0, [Ldefpackage/cx2;

    .line 19
    .line 20
    invoke-direct {v2, v3}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 24
    .line 25
    iget-object v3, p0, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    if-nez v3, :cond_1

    .line 29
    .line 30
    invoke-static {v2, p0}, Ldefpackage/j51;->b(Ldefpackage/f13;Ldefpackage/cx2;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    move p0, v4

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-virtual {v2, v3}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    :goto_1
    iget v3, v2, Ldefpackage/f13;->p:I

    .line 40
    .line 41
    const/4 v5, 0x1

    .line 42
    if-eqz v3, :cond_d

    .line 43
    .line 44
    add-int/lit8 v3, v3, -0x1

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Ldefpackage/f13;->k(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Ldefpackage/cx2;

    .line 51
    .line 52
    iget v6, v3, Ldefpackage/cx2;->q:I

    .line 53
    .line 54
    and-int/lit16 v6, v6, 0x400

    .line 55
    .line 56
    if-nez v6, :cond_3

    .line 57
    .line 58
    invoke-static {v2, v3}, Ldefpackage/j51;->b(Ldefpackage/f13;Ldefpackage/cx2;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    :goto_2
    if-eqz v3, :cond_2

    .line 63
    .line 64
    iget v6, v3, Ldefpackage/cx2;->p:I

    .line 65
    .line 66
    and-int/lit16 v6, v6, 0x400

    .line 67
    .line 68
    if-eqz v6, :cond_c

    .line 69
    .line 70
    const/4 v6, 0x0

    .line 71
    move-object v7, v6

    .line 72
    :goto_3
    if-eqz v3, :cond_2

    .line 73
    .line 74
    instance-of v8, v3, Ldefpackage/ba1;

    .line 75
    .line 76
    if-eqz v8, :cond_5

    .line 77
    .line 78
    check-cast v3, Ldefpackage/ba1;

    .line 79
    .line 80
    add-int/lit8 v8, p0, 0x1

    .line 81
    .line 82
    array-length v9, v1

    .line 83
    if-ge v9, v8, :cond_4

    .line 84
    .line 85
    array-length v9, v1

    .line 86
    mul-int/lit8 v10, v9, 0x2

    .line 87
    .line 88
    invoke-static {v8, v10}, Ljava/lang/Math;->max(II)I

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    new-array v10, v10, [Ljava/lang/Object;

    .line 93
    .line 94
    invoke-static {v1, v4, v10, v4, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 95
    .line 96
    .line 97
    move-object v1, v10

    .line 98
    :cond_4
    aput-object v3, v1, p0

    .line 99
    .line 100
    move p0, v8

    .line 101
    goto :goto_6

    .line 102
    :cond_5
    iget v8, v3, Ldefpackage/cx2;->p:I

    .line 103
    .line 104
    and-int/lit16 v8, v8, 0x400

    .line 105
    .line 106
    if-eqz v8, :cond_b

    .line 107
    .line 108
    instance-of v8, v3, Ldefpackage/fo0;

    .line 109
    .line 110
    if-eqz v8, :cond_b

    .line 111
    .line 112
    move-object v8, v3

    .line 113
    check-cast v8, Ldefpackage/fo0;

    .line 114
    .line 115
    iget-object v8, v8, Ldefpackage/fo0;->C:Ldefpackage/cx2;

    .line 116
    .line 117
    move v9, v4

    .line 118
    :goto_4
    if-eqz v8, :cond_a

    .line 119
    .line 120
    iget v10, v8, Ldefpackage/cx2;->p:I

    .line 121
    .line 122
    and-int/lit16 v10, v10, 0x400

    .line 123
    .line 124
    if-eqz v10, :cond_9

    .line 125
    .line 126
    add-int/lit8 v9, v9, 0x1

    .line 127
    .line 128
    if-ne v9, v5, :cond_6

    .line 129
    .line 130
    move-object v3, v8

    .line 131
    goto :goto_5

    .line 132
    :cond_6
    if-nez v7, :cond_7

    .line 133
    .line 134
    new-instance v7, Ldefpackage/f13;

    .line 135
    .line 136
    new-array v10, v0, [Ldefpackage/cx2;

    .line 137
    .line 138
    invoke-direct {v7, v10}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    :cond_7
    if-eqz v3, :cond_8

    .line 142
    .line 143
    invoke-virtual {v7, v3}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    move-object v3, v6

    .line 147
    :cond_8
    invoke-virtual {v7, v8}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    :cond_9
    :goto_5
    iget-object v8, v8, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_a
    if-ne v9, v5, :cond_b

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_b
    :goto_6
    invoke-static {v7}, Ldefpackage/j51;->c(Ldefpackage/f13;)Ldefpackage/cx2;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    goto :goto_3

    .line 161
    :cond_c
    iget-object v3, v3, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_d
    sget-object v0, Ldefpackage/ca1;->o:Ldefpackage/ca1;

    .line 165
    .line 166
    invoke-static {v1, v4, p0, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    .line 167
    .line 168
    .line 169
    sub-int/2addr p0, v5

    .line 170
    array-length v0, v1

    .line 171
    if-ge p0, v0, :cond_f

    .line 172
    .line 173
    :goto_7
    if-ltz p0, :cond_f

    .line 174
    .line 175
    aget-object v0, v1, p0

    .line 176
    .line 177
    check-cast v0, Ldefpackage/ba1;

    .line 178
    .line 179
    invoke-static {v0}, Ldefpackage/te5;->B(Ldefpackage/ba1;)Z

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    if-eqz v2, :cond_e

    .line 184
    .line 185
    invoke-static {v0, p1}, Ldefpackage/zz1;->f(Ldefpackage/ba1;Ldefpackage/dd0;)Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-eqz v0, :cond_e

    .line 190
    .line 191
    return v5

    .line 192
    :cond_e
    add-int/lit8 p0, p0, -0x1

    .line 193
    .line 194
    goto :goto_7

    .line 195
    :cond_f
    return v4
.end method

.method public static final y(Ldefpackage/ba1;Ldefpackage/dd0;)Z
    .locals 11

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v1, v0, [Ldefpackage/ba1;

    .line 4
    .line 5
    iget-object v2, p0, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 6
    .line 7
    iget-boolean v2, v2, Ldefpackage/cx2;->A:Z

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    const-string v2, "visitChildren called on an unattached node"

    .line 12
    .line 13
    invoke-static {v2}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    new-instance v2, Ldefpackage/f13;

    .line 17
    .line 18
    new-array v3, v0, [Ldefpackage/cx2;

    .line 19
    .line 20
    invoke-direct {v2, v3}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 24
    .line 25
    iget-object v3, p0, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    if-nez v3, :cond_1

    .line 29
    .line 30
    invoke-static {v2, p0}, Ldefpackage/j51;->b(Ldefpackage/f13;Ldefpackage/cx2;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    move p0, v4

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-virtual {v2, v3}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    :goto_1
    iget v3, v2, Ldefpackage/f13;->p:I

    .line 40
    .line 41
    const/4 v5, 0x1

    .line 42
    if-eqz v3, :cond_d

    .line 43
    .line 44
    add-int/lit8 v3, v3, -0x1

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Ldefpackage/f13;->k(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Ldefpackage/cx2;

    .line 51
    .line 52
    iget v6, v3, Ldefpackage/cx2;->q:I

    .line 53
    .line 54
    and-int/lit16 v6, v6, 0x400

    .line 55
    .line 56
    if-nez v6, :cond_3

    .line 57
    .line 58
    invoke-static {v2, v3}, Ldefpackage/j51;->b(Ldefpackage/f13;Ldefpackage/cx2;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    :goto_2
    if-eqz v3, :cond_2

    .line 63
    .line 64
    iget v6, v3, Ldefpackage/cx2;->p:I

    .line 65
    .line 66
    and-int/lit16 v6, v6, 0x400

    .line 67
    .line 68
    if-eqz v6, :cond_c

    .line 69
    .line 70
    const/4 v6, 0x0

    .line 71
    move-object v7, v6

    .line 72
    :goto_3
    if-eqz v3, :cond_2

    .line 73
    .line 74
    instance-of v8, v3, Ldefpackage/ba1;

    .line 75
    .line 76
    if-eqz v8, :cond_5

    .line 77
    .line 78
    check-cast v3, Ldefpackage/ba1;

    .line 79
    .line 80
    add-int/lit8 v8, p0, 0x1

    .line 81
    .line 82
    array-length v9, v1

    .line 83
    if-ge v9, v8, :cond_4

    .line 84
    .line 85
    array-length v9, v1

    .line 86
    mul-int/lit8 v10, v9, 0x2

    .line 87
    .line 88
    invoke-static {v8, v10}, Ljava/lang/Math;->max(II)I

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    new-array v10, v10, [Ljava/lang/Object;

    .line 93
    .line 94
    invoke-static {v1, v4, v10, v4, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 95
    .line 96
    .line 97
    move-object v1, v10

    .line 98
    :cond_4
    aput-object v3, v1, p0

    .line 99
    .line 100
    move p0, v8

    .line 101
    goto :goto_6

    .line 102
    :cond_5
    iget v8, v3, Ldefpackage/cx2;->p:I

    .line 103
    .line 104
    and-int/lit16 v8, v8, 0x400

    .line 105
    .line 106
    if-eqz v8, :cond_b

    .line 107
    .line 108
    instance-of v8, v3, Ldefpackage/fo0;

    .line 109
    .line 110
    if-eqz v8, :cond_b

    .line 111
    .line 112
    move-object v8, v3

    .line 113
    check-cast v8, Ldefpackage/fo0;

    .line 114
    .line 115
    iget-object v8, v8, Ldefpackage/fo0;->C:Ldefpackage/cx2;

    .line 116
    .line 117
    move v9, v4

    .line 118
    :goto_4
    if-eqz v8, :cond_a

    .line 119
    .line 120
    iget v10, v8, Ldefpackage/cx2;->p:I

    .line 121
    .line 122
    and-int/lit16 v10, v10, 0x400

    .line 123
    .line 124
    if-eqz v10, :cond_9

    .line 125
    .line 126
    add-int/lit8 v9, v9, 0x1

    .line 127
    .line 128
    if-ne v9, v5, :cond_6

    .line 129
    .line 130
    move-object v3, v8

    .line 131
    goto :goto_5

    .line 132
    :cond_6
    if-nez v7, :cond_7

    .line 133
    .line 134
    new-instance v7, Ldefpackage/f13;

    .line 135
    .line 136
    new-array v10, v0, [Ldefpackage/cx2;

    .line 137
    .line 138
    invoke-direct {v7, v10}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    :cond_7
    if-eqz v3, :cond_8

    .line 142
    .line 143
    invoke-virtual {v7, v3}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    move-object v3, v6

    .line 147
    :cond_8
    invoke-virtual {v7, v8}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    :cond_9
    :goto_5
    iget-object v8, v8, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_a
    if-ne v9, v5, :cond_b

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_b
    :goto_6
    invoke-static {v7}, Ldefpackage/j51;->c(Ldefpackage/f13;)Ldefpackage/cx2;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    goto :goto_3

    .line 161
    :cond_c
    iget-object v3, v3, Ldefpackage/cx2;->s:Ldefpackage/cx2;

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_d
    sget-object v0, Ldefpackage/ca1;->o:Ldefpackage/ca1;

    .line 165
    .line 166
    invoke-static {v1, v4, p0, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    .line 167
    .line 168
    .line 169
    move v0, v4

    .line 170
    :goto_7
    if-ge v0, p0, :cond_f

    .line 171
    .line 172
    aget-object v2, v1, v0

    .line 173
    .line 174
    check-cast v2, Ldefpackage/ba1;

    .line 175
    .line 176
    invoke-static {v2}, Ldefpackage/te5;->B(Ldefpackage/ba1;)Z

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    if-eqz v3, :cond_e

    .line 181
    .line 182
    invoke-static {v2, p1}, Ldefpackage/zz1;->o(Ldefpackage/ba1;Ldefpackage/dd0;)Z

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    if-eqz v2, :cond_e

    .line 187
    .line 188
    return v5

    .line 189
    :cond_e
    add-int/lit8 v0, v0, 0x1

    .line 190
    .line 191
    goto :goto_7

    .line 192
    :cond_f
    return v4
.end method

.method public static final z(Landroid/view/ViewStructure;Ldefpackage/c72;Landroid/view/autofill/AutofillId;Ljava/lang/String;Ldefpackage/yv3;)V
    .locals 42

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v1, p4

    .line 6
    .line 7
    sget-object v2, Ldefpackage/n94;->a:Ldefpackage/p94;

    .line 8
    .line 9
    sget-object v2, Ldefpackage/d94;->a:Ldefpackage/p94;

    .line 10
    .line 11
    invoke-virtual {v7}, Ldefpackage/c72;->v()Ldefpackage/e94;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const/4 v9, 0x2

    .line 16
    const/16 v12, 0x8

    .line 17
    .line 18
    const/4 v15, 0x1

    .line 19
    if-eqz v2, :cond_16

    .line 20
    .line 21
    iget-object v2, v2, Ldefpackage/e94;->n:Ldefpackage/w03;

    .line 22
    .line 23
    if-eqz v2, :cond_16

    .line 24
    .line 25
    const-wide/16 v16, 0x80

    .line 26
    .line 27
    iget-object v3, v2, Ldefpackage/w03;->b:[Ljava/lang/Object;

    .line 28
    .line 29
    iget-object v4, v2, Ldefpackage/w03;->c:[Ljava/lang/Object;

    .line 30
    .line 31
    iget-object v2, v2, Ldefpackage/w03;->a:[J

    .line 32
    .line 33
    const-wide/16 v18, 0xff

    .line 34
    .line 35
    array-length v5, v2

    .line 36
    sub-int/2addr v5, v9

    .line 37
    move/from16 v33, v9

    .line 38
    .line 39
    if-ltz v5, :cond_14

    .line 40
    .line 41
    move/from16 v29, v15

    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    const/16 v20, 0x0

    .line 45
    .line 46
    const/16 v21, 0x0

    .line 47
    .line 48
    const/16 v22, 0x0

    .line 49
    .line 50
    const/16 v23, 0x0

    .line 51
    .line 52
    const/16 v24, 0x0

    .line 53
    .line 54
    const/16 v25, 0x0

    .line 55
    .line 56
    const/16 v26, 0x0

    .line 57
    .line 58
    const/16 v27, 0x0

    .line 59
    .line 60
    const/16 v28, 0x0

    .line 61
    .line 62
    const/16 v30, 0x0

    .line 63
    .line 64
    const/16 v31, 0x0

    .line 65
    .line 66
    const/16 v32, 0x7

    .line 67
    .line 68
    :goto_0
    aget-wide v8, v2, v6

    .line 69
    .line 70
    const-wide v34, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    not-long v10, v8

    .line 76
    shl-long v10, v10, v32

    .line 77
    .line 78
    and-long/2addr v10, v8

    .line 79
    and-long v10, v10, v34

    .line 80
    .line 81
    cmp-long v10, v10, v34

    .line 82
    .line 83
    if-eqz v10, :cond_13

    .line 84
    .line 85
    sub-int v10, v6, v5

    .line 86
    .line 87
    not-int v10, v10

    .line 88
    ushr-int/lit8 v10, v10, 0x1f

    .line 89
    .line 90
    rsub-int/lit8 v10, v10, 0x8

    .line 91
    .line 92
    const/4 v11, 0x0

    .line 93
    :goto_1
    if-ge v11, v10, :cond_12

    .line 94
    .line 95
    and-long v36, v8, v18

    .line 96
    .line 97
    cmp-long v36, v36, v16

    .line 98
    .line 99
    if-gez v36, :cond_10

    .line 100
    .line 101
    shl-int/lit8 v36, v6, 0x3

    .line 102
    .line 103
    add-int v36, v36, v11

    .line 104
    .line 105
    aget-object v37, v3, v36

    .line 106
    .line 107
    aget-object v36, v4, v36

    .line 108
    .line 109
    move-object/from16 v13, v37

    .line 110
    .line 111
    check-cast v13, Ldefpackage/p94;

    .line 112
    .line 113
    sget-object v14, Ldefpackage/n94;->r:Ldefpackage/p94;

    .line 114
    .line 115
    invoke-static {v13, v14}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v14

    .line 119
    if-eqz v14, :cond_0

    .line 120
    .line 121
    invoke-virtual/range {v36 .. v36}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-object/from16 v20, v36

    .line 125
    .line 126
    check-cast v20, Ldefpackage/mb;

    .line 127
    .line 128
    goto/16 :goto_2

    .line 129
    .line 130
    :cond_0
    sget-object v14, Ldefpackage/n94;->a:Ldefpackage/p94;

    .line 131
    .line 132
    invoke-static {v13, v14}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v14

    .line 136
    if-eqz v14, :cond_1

    .line 137
    .line 138
    invoke-virtual/range {v36 .. v36}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    move-object/from16 v14, v36

    .line 142
    .line 143
    check-cast v14, Ljava/util/List;

    .line 144
    .line 145
    invoke-static {v14}, Ldefpackage/q40;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v14

    .line 149
    check-cast v14, Ljava/lang/String;

    .line 150
    .line 151
    if-eqz v14, :cond_f

    .line 152
    .line 153
    invoke-virtual {v0, v14}, Landroid/view/ViewStructure;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 154
    .line 155
    .line 156
    goto/16 :goto_2

    .line 157
    .line 158
    :cond_1
    sget-object v14, Ldefpackage/n94;->q:Ldefpackage/p94;

    .line 159
    .line 160
    invoke-static {v13, v14}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v14

    .line 164
    if-eqz v14, :cond_2

    .line 165
    .line 166
    invoke-virtual/range {v36 .. v36}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    move-object/from16 v25, v36

    .line 170
    .line 171
    check-cast v25, Ldefpackage/qd0;

    .line 172
    .line 173
    goto/16 :goto_2

    .line 174
    .line 175
    :cond_2
    sget-object v14, Ldefpackage/n94;->s:Ldefpackage/p94;

    .line 176
    .line 177
    invoke-static {v13, v14}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v14

    .line 181
    if-eqz v14, :cond_3

    .line 182
    .line 183
    invoke-virtual/range {v36 .. v36}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    move-object/from16 v24, v36

    .line 187
    .line 188
    check-cast v24, Ldefpackage/wb;

    .line 189
    .line 190
    goto/16 :goto_2

    .line 191
    .line 192
    :cond_3
    sget-object v14, Ldefpackage/n94;->D:Ldefpackage/p94;

    .line 193
    .line 194
    invoke-static {v13, v14}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v14

    .line 198
    if-eqz v14, :cond_4

    .line 199
    .line 200
    invoke-virtual/range {v36 .. v36}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    move-object/from16 v23, v36

    .line 204
    .line 205
    check-cast v23, Ldefpackage/he;

    .line 206
    .line 207
    goto/16 :goto_2

    .line 208
    .line 209
    :cond_4
    sget-object v14, Ldefpackage/n94;->l:Ldefpackage/p94;

    .line 210
    .line 211
    invoke-static {v13, v14}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v14

    .line 215
    if-eqz v14, :cond_5

    .line 216
    .line 217
    invoke-virtual/range {v36 .. v36}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    move-object/from16 v14, v36

    .line 221
    .line 222
    check-cast v14, Ljava/lang/Boolean;

    .line 223
    .line 224
    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    .line 225
    .line 226
    .line 227
    move-result v14

    .line 228
    invoke-virtual {v0, v14}, Landroid/view/ViewStructure;->setFocused(Z)V

    .line 229
    .line 230
    .line 231
    goto/16 :goto_2

    .line 232
    .line 233
    :cond_5
    sget-object v14, Ldefpackage/n94;->N:Ldefpackage/p94;

    .line 234
    .line 235
    invoke-static {v13, v14}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v14

    .line 239
    if-eqz v14, :cond_6

    .line 240
    .line 241
    invoke-virtual/range {v36 .. v36}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    move-object/from16 v30, v36

    .line 245
    .line 246
    check-cast v30, Ljava/lang/Integer;

    .line 247
    .line 248
    goto/16 :goto_2

    .line 249
    .line 250
    :cond_6
    sget-object v14, Ldefpackage/n94;->J:Ldefpackage/p94;

    .line 251
    .line 252
    invoke-static {v13, v14}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v14

    .line 256
    if-eqz v14, :cond_7

    .line 257
    .line 258
    move/from16 v28, v15

    .line 259
    .line 260
    goto/16 :goto_2

    .line 261
    .line 262
    :cond_7
    sget-object v14, Ldefpackage/n94;->n:Ldefpackage/p94;

    .line 263
    .line 264
    invoke-static {v13, v14}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v14

    .line 268
    if-eqz v14, :cond_8

    .line 269
    .line 270
    invoke-virtual/range {v36 .. v36}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    move-object/from16 v14, v36

    .line 274
    .line 275
    check-cast v14, Ljava/lang/Boolean;

    .line 276
    .line 277
    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    .line 278
    .line 279
    .line 280
    move-result v29

    .line 281
    goto :goto_2

    .line 282
    :cond_8
    sget-object v14, Ldefpackage/n94;->w:Ldefpackage/p94;

    .line 283
    .line 284
    invoke-static {v13, v14}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v14

    .line 288
    if-eqz v14, :cond_9

    .line 289
    .line 290
    invoke-virtual/range {v36 .. v36}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    move-object/from16 v27, v36

    .line 294
    .line 295
    check-cast v27, Ldefpackage/m24;

    .line 296
    .line 297
    goto :goto_2

    .line 298
    :cond_9
    sget-object v14, Ldefpackage/n94;->G:Ldefpackage/p94;

    .line 299
    .line 300
    invoke-static {v13, v14}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v14

    .line 304
    if-eqz v14, :cond_a

    .line 305
    .line 306
    invoke-virtual/range {v36 .. v36}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    move-object/from16 v26, v36

    .line 310
    .line 311
    check-cast v26, Ljava/lang/Boolean;

    .line 312
    .line 313
    goto :goto_2

    .line 314
    :cond_a
    sget-object v14, Ldefpackage/n94;->H:Ldefpackage/p94;

    .line 315
    .line 316
    invoke-static {v13, v14}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result v14

    .line 320
    if-eqz v14, :cond_b

    .line 321
    .line 322
    invoke-virtual/range {v36 .. v36}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    move-object/from16 v22, v36

    .line 326
    .line 327
    check-cast v22, Ldefpackage/qu4;

    .line 328
    .line 329
    goto :goto_2

    .line 330
    :cond_b
    sget-object v14, Ldefpackage/d94;->b:Ldefpackage/p94;

    .line 331
    .line 332
    invoke-static {v13, v14}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v14

    .line 336
    if-eqz v14, :cond_c

    .line 337
    .line 338
    invoke-virtual {v0, v15}, Landroid/view/ViewStructure;->setClickable(Z)V

    .line 339
    .line 340
    .line 341
    goto :goto_2

    .line 342
    :cond_c
    sget-object v14, Ldefpackage/d94;->c:Ldefpackage/p94;

    .line 343
    .line 344
    invoke-static {v13, v14}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    move-result v14

    .line 348
    if-eqz v14, :cond_d

    .line 349
    .line 350
    invoke-virtual {v0, v15}, Landroid/view/ViewStructure;->setLongClickable(Z)V

    .line 351
    .line 352
    .line 353
    goto :goto_2

    .line 354
    :cond_d
    sget-object v14, Ldefpackage/d94;->v:Ldefpackage/p94;

    .line 355
    .line 356
    invoke-static {v13, v14}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    move-result v14

    .line 360
    if-eqz v14, :cond_e

    .line 361
    .line 362
    invoke-virtual {v0, v15}, Landroid/view/ViewStructure;->setFocusable(Z)V

    .line 363
    .line 364
    .line 365
    goto :goto_2

    .line 366
    :cond_e
    sget-object v14, Ldefpackage/d94;->k:Ldefpackage/p94;

    .line 367
    .line 368
    invoke-static {v13, v14}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v14

    .line 372
    if-eqz v14, :cond_f

    .line 373
    .line 374
    move/from16 v21, v15

    .line 375
    .line 376
    :cond_f
    :goto_2
    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 377
    .line 378
    move/from16 v38, v15

    .line 379
    .line 380
    const/16 v15, 0x22

    .line 381
    .line 382
    if-lt v14, v15, :cond_11

    .line 383
    .line 384
    sget-object v14, Ldefpackage/zz1;->m:Ldefpackage/p94;

    .line 385
    .line 386
    invoke-static {v13, v14}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    move-result v13

    .line 390
    if-eqz v13, :cond_11

    .line 391
    .line 392
    move-object/from16 v31, v36

    .line 393
    .line 394
    goto :goto_3

    .line 395
    :cond_10
    move/from16 v38, v15

    .line 396
    .line 397
    :cond_11
    :goto_3
    shr-long/2addr v8, v12

    .line 398
    add-int/lit8 v11, v11, 0x1

    .line 399
    .line 400
    move/from16 v15, v38

    .line 401
    .line 402
    goto/16 :goto_1

    .line 403
    .line 404
    :cond_12
    move/from16 v38, v15

    .line 405
    .line 406
    if-ne v10, v12, :cond_15

    .line 407
    .line 408
    goto :goto_4

    .line 409
    :cond_13
    move/from16 v38, v15

    .line 410
    .line 411
    :goto_4
    if-eq v6, v5, :cond_15

    .line 412
    .line 413
    add-int/lit8 v6, v6, 0x1

    .line 414
    .line 415
    move/from16 v15, v38

    .line 416
    .line 417
    goto/16 :goto_0

    .line 418
    .line 419
    :cond_14
    move/from16 v38, v15

    .line 420
    .line 421
    const/16 v32, 0x7

    .line 422
    .line 423
    const-wide v34, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    move/from16 v29, v38

    .line 429
    .line 430
    const/16 v20, 0x0

    .line 431
    .line 432
    const/16 v21, 0x0

    .line 433
    .line 434
    const/16 v22, 0x0

    .line 435
    .line 436
    const/16 v23, 0x0

    .line 437
    .line 438
    const/16 v24, 0x0

    .line 439
    .line 440
    const/16 v25, 0x0

    .line 441
    .line 442
    const/16 v26, 0x0

    .line 443
    .line 444
    const/16 v27, 0x0

    .line 445
    .line 446
    const/16 v28, 0x0

    .line 447
    .line 448
    const/16 v30, 0x0

    .line 449
    .line 450
    const/16 v31, 0x0

    .line 451
    .line 452
    :cond_15
    move-object/from16 v2, v20

    .line 453
    .line 454
    move-object/from16 v8, v22

    .line 455
    .line 456
    move-object/from16 v3, v23

    .line 457
    .line 458
    move-object/from16 v4, v24

    .line 459
    .line 460
    goto :goto_5

    .line 461
    :cond_16
    move/from16 v33, v9

    .line 462
    .line 463
    move/from16 v38, v15

    .line 464
    .line 465
    const-wide/16 v16, 0x80

    .line 466
    .line 467
    const-wide/16 v18, 0xff

    .line 468
    .line 469
    const/16 v32, 0x7

    .line 470
    .line 471
    const-wide v34, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    move/from16 v29, v38

    .line 477
    .line 478
    const/4 v2, 0x0

    .line 479
    const/4 v3, 0x0

    .line 480
    const/4 v4, 0x0

    .line 481
    const/4 v8, 0x0

    .line 482
    const/16 v21, 0x0

    .line 483
    .line 484
    const/16 v25, 0x0

    .line 485
    .line 486
    const/16 v26, 0x0

    .line 487
    .line 488
    const/16 v27, 0x0

    .line 489
    .line 490
    const/16 v28, 0x0

    .line 491
    .line 492
    const/16 v30, 0x0

    .line 493
    .line 494
    const/16 v31, 0x0

    .line 495
    .line 496
    :goto_5
    invoke-virtual {v7}, Ldefpackage/c72;->v()Ldefpackage/e94;

    .line 497
    .line 498
    .line 499
    move-result-object v5

    .line 500
    if-eqz v5, :cond_1a

    .line 501
    .line 502
    iget-boolean v6, v5, Ldefpackage/e94;->p:Z

    .line 503
    .line 504
    if-eqz v6, :cond_1a

    .line 505
    .line 506
    iget-boolean v6, v5, Ldefpackage/e94;->q:Z

    .line 507
    .line 508
    if-eqz v6, :cond_17

    .line 509
    .line 510
    goto :goto_7

    .line 511
    :cond_17
    invoke-virtual {v5}, Ldefpackage/e94;->b()Ldefpackage/e94;

    .line 512
    .line 513
    .line 514
    move-result-object v5

    .line 515
    new-instance v6, Ldefpackage/q03;

    .line 516
    .line 517
    invoke-virtual {v7}, Ldefpackage/c72;->n()Ljava/util/List;

    .line 518
    .line 519
    .line 520
    move-result-object v9

    .line 521
    check-cast v9, Ldefpackage/c13;

    .line 522
    .line 523
    iget-object v9, v9, Ldefpackage/c13;->n:Ldefpackage/f13;

    .line 524
    .line 525
    iget v9, v9, Ldefpackage/f13;->p:I

    .line 526
    .line 527
    invoke-direct {v6, v9}, Ldefpackage/q03;-><init>(I)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v7}, Ldefpackage/c72;->n()Ljava/util/List;

    .line 531
    .line 532
    .line 533
    move-result-object v9

    .line 534
    invoke-virtual {v6, v9}, Ldefpackage/q03;->c(Ljava/util/List;)V

    .line 535
    .line 536
    .line 537
    :cond_18
    :goto_6
    invoke-virtual {v6}, Ldefpackage/q03;->i()Z

    .line 538
    .line 539
    .line 540
    move-result v9

    .line 541
    if-eqz v9, :cond_1a

    .line 542
    .line 543
    iget v9, v6, Ldefpackage/q03;->b:I

    .line 544
    .line 545
    add-int/lit8 v9, v9, -0x1

    .line 546
    .line 547
    invoke-virtual {v6, v9}, Ldefpackage/q03;->k(I)Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v9

    .line 551
    check-cast v9, Ldefpackage/c72;

    .line 552
    .line 553
    invoke-virtual {v9}, Ldefpackage/c72;->v()Ldefpackage/e94;

    .line 554
    .line 555
    .line 556
    move-result-object v10

    .line 557
    if-eqz v10, :cond_18

    .line 558
    .line 559
    iget-boolean v11, v10, Ldefpackage/e94;->p:Z

    .line 560
    .line 561
    if-eqz v11, :cond_19

    .line 562
    .line 563
    goto :goto_6

    .line 564
    :cond_19
    invoke-virtual {v5, v10}, Ldefpackage/e94;->e(Ldefpackage/e94;)V

    .line 565
    .line 566
    .line 567
    iget-boolean v10, v10, Ldefpackage/e94;->q:Z

    .line 568
    .line 569
    if-nez v10, :cond_18

    .line 570
    .line 571
    invoke-virtual {v9}, Ldefpackage/c72;->n()Ljava/util/List;

    .line 572
    .line 573
    .line 574
    move-result-object v9

    .line 575
    invoke-virtual {v6, v9}, Ldefpackage/q03;->c(Ljava/util/List;)V

    .line 576
    .line 577
    .line 578
    goto :goto_6

    .line 579
    :cond_1a
    :goto_7
    if-eqz v5, :cond_20

    .line 580
    .line 581
    iget-object v5, v5, Ldefpackage/e94;->n:Ldefpackage/w03;

    .line 582
    .line 583
    if-eqz v5, :cond_20

    .line 584
    .line 585
    iget-object v6, v5, Ldefpackage/w03;->b:[Ljava/lang/Object;

    .line 586
    .line 587
    iget-object v9, v5, Ldefpackage/w03;->c:[Ljava/lang/Object;

    .line 588
    .line 589
    iget-object v5, v5, Ldefpackage/w03;->a:[J

    .line 590
    .line 591
    array-length v10, v5

    .line 592
    add-int/lit8 v10, v10, -0x2

    .line 593
    .line 594
    if-ltz v10, :cond_20

    .line 595
    .line 596
    const/4 v11, 0x0

    .line 597
    const/4 v13, 0x0

    .line 598
    :goto_8
    aget-wide v14, v5, v11

    .line 599
    .line 600
    move/from16 v20, v12

    .line 601
    .line 602
    move-object/from16 v22, v13

    .line 603
    .line 604
    not-long v12, v14

    .line 605
    shl-long v12, v12, v32

    .line 606
    .line 607
    and-long/2addr v12, v14

    .line 608
    and-long v12, v12, v34

    .line 609
    .line 610
    cmp-long v12, v12, v34

    .line 611
    .line 612
    if-eqz v12, :cond_1f

    .line 613
    .line 614
    sub-int v12, v11, v10

    .line 615
    .line 616
    not-int v12, v12

    .line 617
    ushr-int/lit8 v12, v12, 0x1f

    .line 618
    .line 619
    rsub-int/lit8 v12, v12, 0x8

    .line 620
    .line 621
    move-object/from16 v23, v5

    .line 622
    .line 623
    move-object/from16 v13, v22

    .line 624
    .line 625
    const/4 v5, 0x0

    .line 626
    :goto_9
    if-ge v5, v12, :cond_1e

    .line 627
    .line 628
    and-long v39, v14, v18

    .line 629
    .line 630
    cmp-long v22, v39, v16

    .line 631
    .line 632
    if-gez v22, :cond_1c

    .line 633
    .line 634
    shl-int/lit8 v22, v11, 0x3

    .line 635
    .line 636
    add-int v22, v22, v5

    .line 637
    .line 638
    aget-object v24, v6, v22

    .line 639
    .line 640
    aget-object v22, v9, v22

    .line 641
    .line 642
    move/from16 v36, v5

    .line 643
    .line 644
    move-object/from16 v5, v24

    .line 645
    .line 646
    check-cast v5, Ldefpackage/p94;

    .line 647
    .line 648
    move-object/from16 v24, v6

    .line 649
    .line 650
    sget-object v6, Ldefpackage/n94;->j:Ldefpackage/p94;

    .line 651
    .line 652
    invoke-static {v5, v6}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 653
    .line 654
    .line 655
    move-result v6

    .line 656
    if-eqz v6, :cond_1b

    .line 657
    .line 658
    const/4 v6, 0x0

    .line 659
    invoke-virtual {v0, v6}, Landroid/view/ViewStructure;->setEnabled(Z)V

    .line 660
    .line 661
    .line 662
    goto :goto_a

    .line 663
    :cond_1b
    sget-object v6, Ldefpackage/n94;->z:Ldefpackage/p94;

    .line 664
    .line 665
    invoke-static {v5, v6}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 666
    .line 667
    .line 668
    move-result v5

    .line 669
    if-eqz v5, :cond_1d

    .line 670
    .line 671
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 672
    .line 673
    .line 674
    move-object/from16 v13, v22

    .line 675
    .line 676
    check-cast v13, Ljava/util/List;

    .line 677
    .line 678
    goto :goto_a

    .line 679
    :cond_1c
    move/from16 v36, v5

    .line 680
    .line 681
    move-object/from16 v24, v6

    .line 682
    .line 683
    :cond_1d
    :goto_a
    shr-long v14, v14, v20

    .line 684
    .line 685
    add-int/lit8 v5, v36, 0x1

    .line 686
    .line 687
    move-object/from16 v6, v24

    .line 688
    .line 689
    goto :goto_9

    .line 690
    :cond_1e
    move-object/from16 v24, v6

    .line 691
    .line 692
    move/from16 v5, v20

    .line 693
    .line 694
    if-ne v12, v5, :cond_21

    .line 695
    .line 696
    goto :goto_b

    .line 697
    :cond_1f
    move-object/from16 v23, v5

    .line 698
    .line 699
    move-object/from16 v24, v6

    .line 700
    .line 701
    move/from16 v5, v20

    .line 702
    .line 703
    move-object/from16 v13, v22

    .line 704
    .line 705
    :goto_b
    if-eq v11, v10, :cond_21

    .line 706
    .line 707
    add-int/lit8 v11, v11, 0x1

    .line 708
    .line 709
    move v12, v5

    .line 710
    move-object/from16 v5, v23

    .line 711
    .line 712
    move-object/from16 v6, v24

    .line 713
    .line 714
    goto :goto_8

    .line 715
    :cond_20
    const/4 v13, 0x0

    .line 716
    :cond_21
    iget v5, v7, Ldefpackage/c72;->o:I

    .line 717
    .line 718
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 719
    .line 720
    .line 721
    move-result-object v5

    .line 722
    invoke-virtual {v7}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 723
    .line 724
    .line 725
    move-result-object v6

    .line 726
    if-nez v6, :cond_22

    .line 727
    .line 728
    const/4 v5, 0x0

    .line 729
    :cond_22
    if-eqz v5, :cond_23

    .line 730
    .line 731
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 732
    .line 733
    .line 734
    move-result v5

    .line 735
    :goto_c
    move-object/from16 v6, p2

    .line 736
    .line 737
    goto :goto_d

    .line 738
    :cond_23
    const/4 v5, -0x1

    .line 739
    goto :goto_c

    .line 740
    :goto_d
    invoke-static {v0, v6, v5}, Ldefpackage/j3;->u(Landroid/view/ViewStructure;Landroid/view/autofill/AutofillId;I)V

    .line 741
    .line 742
    .line 743
    move-object/from16 v6, p3

    .line 744
    .line 745
    const/4 v9, 0x0

    .line 746
    invoke-virtual {v0, v5, v6, v9, v9}, Landroid/view/ViewStructure;->setId(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 747
    .line 748
    .line 749
    if-eqz v2, :cond_24

    .line 750
    .line 751
    iget v2, v2, Ldefpackage/mb;->a:I

    .line 752
    .line 753
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 754
    .line 755
    .line 756
    move-result-object v2

    .line 757
    goto :goto_e

    .line 758
    :cond_24
    if-eqz v21, :cond_25

    .line 759
    .line 760
    invoke-static/range {v38 .. v38}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 761
    .line 762
    .line 763
    move-result-object v2

    .line 764
    goto :goto_e

    .line 765
    :cond_25
    if-eqz v8, :cond_26

    .line 766
    .line 767
    invoke-static/range {v33 .. v33}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 768
    .line 769
    .line 770
    move-result-object v2

    .line 771
    goto :goto_e

    .line 772
    :cond_26
    move-object v2, v9

    .line 773
    :goto_e
    if-eqz v2, :cond_27

    .line 774
    .line 775
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 776
    .line 777
    .line 778
    move-result v2

    .line 779
    invoke-static {v0, v2}, Ldefpackage/tn;->r(Landroid/view/ViewStructure;I)V

    .line 780
    .line 781
    .line 782
    :cond_27
    if-eqz v3, :cond_2a

    .line 783
    .line 784
    iget-object v2, v3, Ldefpackage/he;->o:Ljava/lang/String;

    .line 785
    .line 786
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 787
    .line 788
    .line 789
    move-result v3

    .line 790
    const/16 v5, 0x1388

    .line 791
    .line 792
    if-gt v3, v5, :cond_28

    .line 793
    .line 794
    goto :goto_f

    .line 795
    :cond_28
    const/16 v3, 0x1387

    .line 796
    .line 797
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    .line 798
    .line 799
    .line 800
    move-result v6

    .line 801
    invoke-static {v6}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 802
    .line 803
    .line 804
    move-result v6

    .line 805
    if-eqz v6, :cond_29

    .line 806
    .line 807
    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    .line 808
    .line 809
    .line 810
    move-result v6

    .line 811
    invoke-static {v6}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 812
    .line 813
    .line 814
    move-result v6

    .line 815
    if-eqz v6, :cond_29

    .line 816
    .line 817
    invoke-static {v3, v2}, Ldefpackage/qm4;->I0(ILjava/lang/String;)Ljava/lang/CharSequence;

    .line 818
    .line 819
    .line 820
    move-result-object v2

    .line 821
    goto :goto_f

    .line 822
    :cond_29
    invoke-static {v5, v2}, Ldefpackage/qm4;->I0(ILjava/lang/String;)Ljava/lang/CharSequence;

    .line 823
    .line 824
    .line 825
    move-result-object v2

    .line 826
    :goto_f
    invoke-static {v2}, Ldefpackage/tn;->g(Ljava/lang/CharSequence;)Landroid/view/autofill/AutofillValue;

    .line 827
    .line 828
    .line 829
    move-result-object v2

    .line 830
    invoke-static {v0, v2}, Ldefpackage/j3;->v(Landroid/view/ViewStructure;Landroid/view/autofill/AutofillValue;)V

    .line 831
    .line 832
    .line 833
    :cond_2a
    if-eqz v4, :cond_2b

    .line 834
    .line 835
    iget-object v2, v4, Ldefpackage/wb;->a:Landroid/view/autofill/AutofillValue;

    .line 836
    .line 837
    invoke-static {v0, v2}, Ldefpackage/j3;->v(Landroid/view/ViewStructure;Landroid/view/autofill/AutofillValue;)V

    .line 838
    .line 839
    .line 840
    :cond_2b
    if-eqz v25, :cond_2c

    .line 841
    .line 842
    invoke-static/range {v25 .. v25}, Ldefpackage/h12;->t(Ldefpackage/qd0;)[Ljava/lang/String;

    .line 843
    .line 844
    .line 845
    move-result-object v2

    .line 846
    if-eqz v2, :cond_2c

    .line 847
    .line 848
    invoke-static {v0, v2}, Ldefpackage/tn;->s(Landroid/view/ViewStructure;[Ljava/lang/String;)V

    .line 849
    .line 850
    .line 851
    :cond_2c
    iget v2, v7, Ldefpackage/c72;->o:I

    .line 852
    .line 853
    iget-object v3, v1, Ldefpackage/yv3;->a:Ldefpackage/e02;

    .line 854
    .line 855
    invoke-virtual {v3, v2}, Ldefpackage/e02;->b(I)Ljava/lang/Object;

    .line 856
    .line 857
    .line 858
    move-result-object v2

    .line 859
    check-cast v2, Ldefpackage/c72;

    .line 860
    .line 861
    if-eqz v2, :cond_2d

    .line 862
    .line 863
    iget v3, v2, Ldefpackage/c72;->t:I

    .line 864
    .line 865
    const/4 v4, -0x4

    .line 866
    if-eq v3, v4, :cond_2d

    .line 867
    .line 868
    iget-object v3, v1, Ldefpackage/yv3;->c:Ldefpackage/ue1;

    .line 869
    .line 870
    invoke-virtual {v1, v2}, Ldefpackage/yv3;->e(Ldefpackage/c72;)I

    .line 871
    .line 872
    .line 873
    move-result v1

    .line 874
    iget-object v2, v3, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 875
    .line 876
    check-cast v2, [J

    .line 877
    .line 878
    aget-wide v3, v2, v1

    .line 879
    .line 880
    add-int/lit8 v1, v1, 0x1

    .line 881
    .line 882
    aget-wide v1, v2, v1

    .line 883
    .line 884
    const/16 v5, 0x20

    .line 885
    .line 886
    shr-long v9, v3, v5

    .line 887
    .line 888
    long-to-int v6, v9

    .line 889
    long-to-int v3, v3

    .line 890
    shr-long v4, v1, v5

    .line 891
    .line 892
    long-to-int v4, v4

    .line 893
    long-to-int v1, v1

    .line 894
    sub-int v5, v4, v6

    .line 895
    .line 896
    sub-int/2addr v1, v3

    .line 897
    move v2, v3

    .line 898
    const/4 v3, 0x0

    .line 899
    const/4 v4, 0x0

    .line 900
    move/from16 v41, v6

    .line 901
    .line 902
    move v6, v1

    .line 903
    move/from16 v1, v41

    .line 904
    .line 905
    invoke-virtual/range {v0 .. v6}, Landroid/view/ViewStructure;->setDimens(IIIIII)V

    .line 906
    .line 907
    .line 908
    :cond_2d
    if-eqz v26, :cond_2e

    .line 909
    .line 910
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Boolean;->booleanValue()Z

    .line 911
    .line 912
    .line 913
    move-result v1

    .line 914
    invoke-virtual {v0, v1}, Landroid/view/ViewStructure;->setSelected(Z)V

    .line 915
    .line 916
    .line 917
    :cond_2e
    if-eqz v8, :cond_30

    .line 918
    .line 919
    move/from16 v6, v38

    .line 920
    .line 921
    invoke-virtual {v0, v6}, Landroid/view/ViewStructure;->setCheckable(Z)V

    .line 922
    .line 923
    .line 924
    sget-object v1, Ldefpackage/qu4;->n:Ldefpackage/qu4;

    .line 925
    .line 926
    if-ne v8, v1, :cond_2f

    .line 927
    .line 928
    move v1, v6

    .line 929
    goto :goto_10

    .line 930
    :cond_2f
    const/4 v1, 0x0

    .line 931
    :goto_10
    invoke-virtual {v0, v1}, Landroid/view/ViewStructure;->setChecked(Z)V

    .line 932
    .line 933
    .line 934
    goto :goto_11

    .line 935
    :cond_30
    move/from16 v6, v38

    .line 936
    .line 937
    if-eqz v26, :cond_31

    .line 938
    .line 939
    invoke-virtual {v0, v6}, Landroid/view/ViewStructure;->setCheckable(Z)V

    .line 940
    .line 941
    .line 942
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Boolean;->booleanValue()Z

    .line 943
    .line 944
    .line 945
    move-result v1

    .line 946
    invoke-virtual {v0, v1}, Landroid/view/ViewStructure;->setChecked(Z)V

    .line 947
    .line 948
    .line 949
    :cond_31
    :goto_11
    sget-object v1, Ldefpackage/qd0;->a:Ldefpackage/pd0;

    .line 950
    .line 951
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 952
    .line 953
    .line 954
    sget-object v1, Ldefpackage/pd0;->b:Ldefpackage/nb;

    .line 955
    .line 956
    invoke-static {v1}, Ldefpackage/h12;->t(Ldefpackage/qd0;)[Ljava/lang/String;

    .line 957
    .line 958
    .line 959
    move-result-object v1

    .line 960
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 961
    .line 962
    .line 963
    array-length v2, v1

    .line 964
    if-eqz v2, :cond_3f

    .line 965
    .line 966
    const/16 v37, 0x0

    .line 967
    .line 968
    aget-object v1, v1, v37

    .line 969
    .line 970
    if-eqz v25, :cond_32

    .line 971
    .line 972
    invoke-static/range {v25 .. v25}, Ldefpackage/h12;->t(Ldefpackage/qd0;)[Ljava/lang/String;

    .line 973
    .line 974
    .line 975
    move-result-object v2

    .line 976
    if-eqz v2, :cond_32

    .line 977
    .line 978
    invoke-static {v2, v1}, Ldefpackage/ti;->m0([Ljava/lang/Object;Ljava/lang/Object;)I

    .line 979
    .line 980
    .line 981
    move-result v1

    .line 982
    if-ltz v1, :cond_32

    .line 983
    .line 984
    move v1, v6

    .line 985
    goto :goto_12

    .line 986
    :cond_32
    move/from16 v1, v37

    .line 987
    .line 988
    :goto_12
    if-nez v28, :cond_34

    .line 989
    .line 990
    if-eqz v1, :cond_33

    .line 991
    .line 992
    goto :goto_13

    .line 993
    :cond_33
    move/from16 v1, v37

    .line 994
    .line 995
    goto :goto_14

    .line 996
    :cond_34
    :goto_13
    move v1, v6

    .line 997
    :goto_14
    if-nez v1, :cond_36

    .line 998
    .line 999
    if-eqz v29, :cond_35

    .line 1000
    .line 1001
    goto :goto_15

    .line 1002
    :cond_35
    move/from16 v15, v37

    .line 1003
    .line 1004
    goto :goto_16

    .line 1005
    :cond_36
    :goto_15
    move v15, v6

    .line 1006
    :goto_16
    invoke-static {v0, v15}, Ldefpackage/j3;->w(Landroid/view/ViewStructure;Z)V

    .line 1007
    .line 1008
    .line 1009
    iget-object v2, v7, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 1010
    .line 1011
    iget-object v2, v2, Ldefpackage/w12;->e:Ljava/lang/Object;

    .line 1012
    .line 1013
    check-cast v2, Ldefpackage/f63;

    .line 1014
    .line 1015
    invoke-virtual {v2}, Ldefpackage/f63;->J0()Z

    .line 1016
    .line 1017
    .line 1018
    move-result v2

    .line 1019
    if-eqz v2, :cond_37

    .line 1020
    .line 1021
    const/4 v6, 0x4

    .line 1022
    goto :goto_17

    .line 1023
    :cond_37
    move/from16 v6, v37

    .line 1024
    .line 1025
    :goto_17
    invoke-virtual {v0, v6}, Landroid/view/ViewStructure;->setVisibility(I)V

    .line 1026
    .line 1027
    .line 1028
    if-eqz v13, :cond_39

    .line 1029
    .line 1030
    invoke-interface {v13}, Ljava/util/Collection;->size()I

    .line 1031
    .line 1032
    .line 1033
    move-result v2

    .line 1034
    const-string v3, ""

    .line 1035
    .line 1036
    move/from16 v14, v37

    .line 1037
    .line 1038
    :goto_18
    if-ge v14, v2, :cond_38

    .line 1039
    .line 1040
    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v4

    .line 1044
    check-cast v4, Ldefpackage/he;

    .line 1045
    .line 1046
    iget-object v4, v4, Ldefpackage/he;->o:Ljava/lang/String;

    .line 1047
    .line 1048
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1049
    .line 1050
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 1051
    .line 1052
    .line 1053
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1054
    .line 1055
    .line 1056
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1057
    .line 1058
    .line 1059
    const-string v3, "\n"

    .line 1060
    .line 1061
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1062
    .line 1063
    .line 1064
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v3

    .line 1068
    add-int/lit8 v14, v14, 0x1

    .line 1069
    .line 1070
    goto :goto_18

    .line 1071
    :cond_38
    invoke-virtual {v0, v3}, Landroid/view/ViewStructure;->setText(Ljava/lang/CharSequence;)V

    .line 1072
    .line 1073
    .line 1074
    const-string v2, "android.widget.TextView"

    .line 1075
    .line 1076
    invoke-virtual {v0, v2}, Landroid/view/ViewStructure;->setClassName(Ljava/lang/String;)V

    .line 1077
    .line 1078
    .line 1079
    :cond_39
    invoke-virtual {v7}, Ldefpackage/c72;->n()Ljava/util/List;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v2

    .line 1083
    check-cast v2, Ldefpackage/c13;

    .line 1084
    .line 1085
    invoke-virtual {v2}, Ldefpackage/c13;->isEmpty()Z

    .line 1086
    .line 1087
    .line 1088
    move-result v2

    .line 1089
    if-eqz v2, :cond_3a

    .line 1090
    .line 1091
    if-eqz v27, :cond_3a

    .line 1092
    .line 1093
    const-string v2, "android.widget.ImageView"

    .line 1094
    .line 1095
    invoke-virtual {v0, v2}, Landroid/view/ViewStructure;->setClassName(Ljava/lang/String;)V

    .line 1096
    .line 1097
    .line 1098
    :cond_3a
    if-eqz v21, :cond_3c

    .line 1099
    .line 1100
    const-string v2, "android.widget.EditText"

    .line 1101
    .line 1102
    invoke-virtual {v0, v2}, Landroid/view/ViewStructure;->setClassName(Ljava/lang/String;)V

    .line 1103
    .line 1104
    .line 1105
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1106
    .line 1107
    const/16 v3, 0x1c

    .line 1108
    .line 1109
    if-lt v2, v3, :cond_3b

    .line 1110
    .line 1111
    if-eqz v30, :cond_3b

    .line 1112
    .line 1113
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Number;->intValue()I

    .line 1114
    .line 1115
    .line 1116
    move-result v2

    .line 1117
    invoke-static {v0, v2}, Ldefpackage/i3;->s(Landroid/view/ViewStructure;I)V

    .line 1118
    .line 1119
    .line 1120
    :cond_3b
    if-eqz v1, :cond_3c

    .line 1121
    .line 1122
    invoke-static {v0}, Ldefpackage/j3;->t(Landroid/view/ViewStructure;)V

    .line 1123
    .line 1124
    .line 1125
    :cond_3c
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1126
    .line 1127
    const/16 v1, 0x23

    .line 1128
    .line 1129
    if-lt v0, v1, :cond_3e

    .line 1130
    .line 1131
    if-nez v31, :cond_3d

    .line 1132
    .line 1133
    goto :goto_19

    .line 1134
    :cond_3d
    invoke-static {}, Ldefpackage/kf2;->k()V

    .line 1135
    .line 1136
    .line 1137
    :cond_3e
    :goto_19
    return-void

    .line 1138
    :cond_3f
    const-string v0, "Array is empty."

    .line 1139
    .line 1140
    invoke-static {v0}, Ldefpackage/kf2;->m(Ljava/lang/String;)V

    .line 1141
    .line 1142
    .line 1143
    return-void
.end method


# virtual methods
.method public j(Ldefpackage/uv2;)Ldefpackage/qv2;
    .locals 2

    .line 1
    iget-object v0, p1, Ldefpackage/cj0;->r:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasArray()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x0

    .line 27
    :goto_0
    invoke-static {v1}, Ldefpackage/rr2;->l(Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1, v0}, Ldefpackage/zz1;->k(Ldefpackage/uv2;Ljava/nio/ByteBuffer;)Ldefpackage/qv2;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public abstract k(Ldefpackage/uv2;Ljava/nio/ByteBuffer;)Ldefpackage/qv2;
.end method
