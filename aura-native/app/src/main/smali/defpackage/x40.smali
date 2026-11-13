.class public final Ldefpackage/x40;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final b:J

.field public static final c:J

.field public static final d:J

.field public static final e:J

.field public static final f:J

.field public static final g:J

.field public static final synthetic h:I


# instance fields
.field public final a:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide v0, 0xff000000L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Ldefpackage/e35;->c(J)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    sput-wide v0, Ldefpackage/x40;->b:J

    .line 11
    .line 12
    const-wide v0, 0xff444444L

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Ldefpackage/e35;->c(J)J

    .line 18
    .line 19
    .line 20
    const-wide v0, 0xff888888L

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, Ldefpackage/e35;->c(J)J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    sput-wide v0, Ldefpackage/x40;->c:J

    .line 30
    .line 31
    const-wide v0, 0xffccccccL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    invoke-static {v0, v1}, Ldefpackage/e35;->c(J)J

    .line 37
    .line 38
    .line 39
    const-wide v0, 0xffffffffL

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    invoke-static {v0, v1}, Ldefpackage/e35;->c(J)J

    .line 45
    .line 46
    .line 47
    const-wide v0, 0xffff0000L

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    invoke-static {v0, v1}, Ldefpackage/e35;->c(J)J

    .line 53
    .line 54
    .line 55
    move-result-wide v0

    .line 56
    sput-wide v0, Ldefpackage/x40;->d:J

    .line 57
    .line 58
    const-wide v0, 0xff00ff00L

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    invoke-static {v0, v1}, Ldefpackage/e35;->c(J)J

    .line 64
    .line 65
    .line 66
    const-wide v0, 0xff0000ffL

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    invoke-static {v0, v1}, Ldefpackage/e35;->c(J)J

    .line 72
    .line 73
    .line 74
    move-result-wide v0

    .line 75
    sput-wide v0, Ldefpackage/x40;->e:J

    .line 76
    .line 77
    const-wide v0, 0xffffff00L

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    invoke-static {v0, v1}, Ldefpackage/e35;->c(J)J

    .line 83
    .line 84
    .line 85
    const-wide v0, 0xff00ffffL

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    invoke-static {v0, v1}, Ldefpackage/e35;->c(J)J

    .line 91
    .line 92
    .line 93
    const-wide v0, 0xffff00ffL

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    invoke-static {v0, v1}, Ldefpackage/e35;->c(J)J

    .line 99
    .line 100
    .line 101
    const/4 v0, 0x0

    .line 102
    invoke-static {v0}, Ldefpackage/e35;->b(I)J

    .line 103
    .line 104
    .line 105
    move-result-wide v0

    .line 106
    sput-wide v0, Ldefpackage/x40;->f:J

    .line 107
    .line 108
    const/4 v0, 0x0

    .line 109
    sget-object v1, Ldefpackage/s50;->u:Ldefpackage/k24;

    .line 110
    .line 111
    invoke-static {v0, v0, v0, v0, v1}, Ldefpackage/e35;->a(FFFFLdefpackage/p50;)J

    .line 112
    .line 113
    .line 114
    move-result-wide v0

    .line 115
    sput-wide v0, Ldefpackage/x40;->g:J

    .line 116
    .line 117
    return-void
.end method

.method public synthetic constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Ldefpackage/x40;->a:J

    .line 5
    .line 6
    return-void
.end method

.method public static final a(JLdefpackage/p50;)J
    .locals 4

    .line 1
    const-wide/16 v0, 0x3f

    .line 2
    .line 3
    and-long/2addr v0, p0

    .line 4
    long-to-int v0, v0

    .line 5
    sget-object v1, Ldefpackage/s50;->y:[Ldefpackage/p50;

    .line 6
    .line 7
    aget-object v0, v1, v0

    .line 8
    .line 9
    iget v1, v0, Ldefpackage/p50;->c:I

    .line 10
    .line 11
    iget v2, p2, Ldefpackage/p50;->c:I

    .line 12
    .line 13
    or-int v3, v1, v2

    .line 14
    .line 15
    if-gez v3, :cond_0

    .line 16
    .line 17
    invoke-static {v0, p2}, Ldefpackage/uo;->m(Ldefpackage/p50;Ldefpackage/p50;)Ldefpackage/xa0;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    sget-object v3, Ldefpackage/ya0;->a:Ldefpackage/i03;

    .line 23
    .line 24
    shl-int/lit8 v2, v2, 0x6

    .line 25
    .line 26
    or-int/2addr v1, v2

    .line 27
    invoke-virtual {v3, v1}, Ldefpackage/e02;->b(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    invoke-static {v0, p2}, Ldefpackage/uo;->m(Ldefpackage/p50;Ldefpackage/p50;)Ldefpackage/xa0;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v3, v1, v2}, Ldefpackage/i03;->i(ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    move-object p2, v2

    .line 41
    check-cast p2, Ldefpackage/xa0;

    .line 42
    .line 43
    :goto_0
    invoke-virtual {p2, p0, p1}, Ldefpackage/xa0;->a(J)J

    .line 44
    .line 45
    .line 46
    move-result-wide p0

    .line 47
    return-wide p0
.end method

.method public static b(JF)J
    .locals 5

    .line 1
    invoke-static {p0, p1}, Ldefpackage/x40;->g(J)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p0, p1}, Ldefpackage/x40;->f(J)F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p0, p1}, Ldefpackage/x40;->e(J)F

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const-wide/16 v3, 0x3f

    .line 14
    .line 15
    and-long/2addr p0, v3

    .line 16
    long-to-int p0, p0

    .line 17
    sget-object p1, Ldefpackage/s50;->y:[Ldefpackage/p50;

    .line 18
    .line 19
    aget-object p0, p1, p0

    .line 20
    .line 21
    invoke-static {v0, v1, v2, p2, p0}, Ldefpackage/e35;->a(FFFFLdefpackage/p50;)J

    .line 22
    .line 23
    .line 24
    move-result-wide p0

    .line 25
    return-wide p0
.end method

.method public static final c(JJ)Z
    .locals 0

    .line 1
    cmp-long p0, p0, p2

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public static final d(J)F
    .locals 4

    .line 1
    const-wide/16 v0, 0x3f

    .line 2
    .line 3
    and-long/2addr v0, p0

    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const/16 v0, 0x38

    .line 11
    .line 12
    ushr-long/2addr p0, v0

    .line 13
    const-wide/16 v0, 0xff

    .line 14
    .line 15
    and-long/2addr p0, v0

    .line 16
    invoke-static {p0, p1}, Ldefpackage/rr2;->W(J)D

    .line 17
    .line 18
    .line 19
    move-result-wide p0

    .line 20
    double-to-float p0, p0

    .line 21
    const/high16 p1, 0x437f0000    # 255.0f

    .line 22
    .line 23
    :goto_0
    div-float/2addr p0, p1

    .line 24
    return p0

    .line 25
    :cond_0
    const/4 v0, 0x6

    .line 26
    ushr-long/2addr p0, v0

    .line 27
    const-wide/16 v0, 0x3ff

    .line 28
    .line 29
    and-long/2addr p0, v0

    .line 30
    invoke-static {p0, p1}, Ldefpackage/rr2;->W(J)D

    .line 31
    .line 32
    .line 33
    move-result-wide p0

    .line 34
    double-to-float p0, p0

    .line 35
    const p1, 0x447fc000    # 1023.0f

    .line 36
    .line 37
    .line 38
    goto :goto_0
.end method

.method public static final e(J)F
    .locals 5

    .line 1
    const-wide/16 v0, 0x3f

    .line 2
    .line 3
    and-long/2addr v0, p0

    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const/16 v0, 0x20

    .line 11
    .line 12
    ushr-long/2addr p0, v0

    .line 13
    const-wide/16 v0, 0xff

    .line 14
    .line 15
    and-long/2addr p0, v0

    .line 16
    invoke-static {p0, p1}, Ldefpackage/rr2;->W(J)D

    .line 17
    .line 18
    .line 19
    move-result-wide p0

    .line 20
    double-to-float p0, p0

    .line 21
    const/high16 p1, 0x437f0000    # 255.0f

    .line 22
    .line 23
    div-float/2addr p0, p1

    .line 24
    return p0

    .line 25
    :cond_0
    const/16 v0, 0x10

    .line 26
    .line 27
    ushr-long/2addr p0, v0

    .line 28
    const-wide/32 v1, 0xffff

    .line 29
    .line 30
    .line 31
    and-long/2addr p0, v1

    .line 32
    long-to-int p0, p0

    .line 33
    int-to-short p0, p0

    .line 34
    const p1, 0xffff

    .line 35
    .line 36
    .line 37
    and-int/2addr p1, p0

    .line 38
    const v1, 0x8000

    .line 39
    .line 40
    .line 41
    and-int/2addr v1, p0

    .line 42
    ushr-int/lit8 p1, p1, 0xa

    .line 43
    .line 44
    const/16 v2, 0x1f

    .line 45
    .line 46
    and-int/2addr p1, v2

    .line 47
    and-int/lit16 p0, p0, 0x3ff

    .line 48
    .line 49
    if-nez p1, :cond_3

    .line 50
    .line 51
    if-eqz p0, :cond_2

    .line 52
    .line 53
    const/high16 p1, 0x3f000000    # 0.5f

    .line 54
    .line 55
    add-int/2addr p0, p1

    .line 56
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    sget p1, Ldefpackage/b81;->a:F

    .line 61
    .line 62
    sub-float/2addr p0, p1

    .line 63
    if-nez v1, :cond_1

    .line 64
    .line 65
    return p0

    .line 66
    :cond_1
    neg-float p0, p0

    .line 67
    return p0

    .line 68
    :cond_2
    const/4 p0, 0x0

    .line 69
    move p1, p0

    .line 70
    goto :goto_1

    .line 71
    :cond_3
    shl-int/lit8 p0, p0, 0xd

    .line 72
    .line 73
    if-ne p1, v2, :cond_5

    .line 74
    .line 75
    const/16 p1, 0xff

    .line 76
    .line 77
    if-eqz p0, :cond_4

    .line 78
    .line 79
    const/high16 v2, 0x400000

    .line 80
    .line 81
    or-int/2addr p0, v2

    .line 82
    :cond_4
    :goto_0
    move v4, p1

    .line 83
    move p1, p0

    .line 84
    move p0, v4

    .line 85
    goto :goto_1

    .line 86
    :cond_5
    add-int/lit8 p1, p1, 0x70

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :goto_1
    shl-int/lit8 v0, v1, 0x10

    .line 90
    .line 91
    shl-int/lit8 p0, p0, 0x17

    .line 92
    .line 93
    or-int/2addr p0, v0

    .line 94
    or-int/2addr p0, p1

    .line 95
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    return p0
.end method

.method public static final f(J)F
    .locals 5

    .line 1
    const-wide/16 v0, 0x3f

    .line 2
    .line 3
    and-long/2addr v0, p0

    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const/16 v0, 0x28

    .line 11
    .line 12
    ushr-long/2addr p0, v0

    .line 13
    const-wide/16 v0, 0xff

    .line 14
    .line 15
    and-long/2addr p0, v0

    .line 16
    invoke-static {p0, p1}, Ldefpackage/rr2;->W(J)D

    .line 17
    .line 18
    .line 19
    move-result-wide p0

    .line 20
    double-to-float p0, p0

    .line 21
    const/high16 p1, 0x437f0000    # 255.0f

    .line 22
    .line 23
    div-float/2addr p0, p1

    .line 24
    return p0

    .line 25
    :cond_0
    const/16 v0, 0x20

    .line 26
    .line 27
    ushr-long/2addr p0, v0

    .line 28
    const-wide/32 v0, 0xffff

    .line 29
    .line 30
    .line 31
    and-long/2addr p0, v0

    .line 32
    long-to-int p0, p0

    .line 33
    int-to-short p0, p0

    .line 34
    const p1, 0xffff

    .line 35
    .line 36
    .line 37
    and-int/2addr p1, p0

    .line 38
    const v0, 0x8000

    .line 39
    .line 40
    .line 41
    and-int/2addr v0, p0

    .line 42
    ushr-int/lit8 p1, p1, 0xa

    .line 43
    .line 44
    const/16 v1, 0x1f

    .line 45
    .line 46
    and-int/2addr p1, v1

    .line 47
    and-int/lit16 p0, p0, 0x3ff

    .line 48
    .line 49
    if-nez p1, :cond_3

    .line 50
    .line 51
    if-eqz p0, :cond_2

    .line 52
    .line 53
    const/high16 p1, 0x3f000000    # 0.5f

    .line 54
    .line 55
    add-int/2addr p0, p1

    .line 56
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    sget p1, Ldefpackage/b81;->a:F

    .line 61
    .line 62
    sub-float/2addr p0, p1

    .line 63
    if-nez v0, :cond_1

    .line 64
    .line 65
    return p0

    .line 66
    :cond_1
    neg-float p0, p0

    .line 67
    return p0

    .line 68
    :cond_2
    const/4 p0, 0x0

    .line 69
    move p1, p0

    .line 70
    goto :goto_1

    .line 71
    :cond_3
    shl-int/lit8 p0, p0, 0xd

    .line 72
    .line 73
    if-ne p1, v1, :cond_5

    .line 74
    .line 75
    const/16 p1, 0xff

    .line 76
    .line 77
    if-eqz p0, :cond_4

    .line 78
    .line 79
    const/high16 v1, 0x400000

    .line 80
    .line 81
    or-int/2addr p0, v1

    .line 82
    :cond_4
    :goto_0
    move v4, p1

    .line 83
    move p1, p0

    .line 84
    move p0, v4

    .line 85
    goto :goto_1

    .line 86
    :cond_5
    add-int/lit8 p1, p1, 0x70

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :goto_1
    shl-int/lit8 v0, v0, 0x10

    .line 90
    .line 91
    shl-int/lit8 p0, p0, 0x17

    .line 92
    .line 93
    or-int/2addr p0, v0

    .line 94
    or-int/2addr p0, p1

    .line 95
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    return p0
.end method

.method public static final g(J)F
    .locals 5

    .line 1
    const-wide/16 v0, 0x3f

    .line 2
    .line 3
    and-long/2addr v0, p0

    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    const/16 v1, 0x30

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    ushr-long/2addr p0, v1

    .line 13
    const-wide/16 v0, 0xff

    .line 14
    .line 15
    and-long/2addr p0, v0

    .line 16
    invoke-static {p0, p1}, Ldefpackage/rr2;->W(J)D

    .line 17
    .line 18
    .line 19
    move-result-wide p0

    .line 20
    double-to-float p0, p0

    .line 21
    const/high16 p1, 0x437f0000    # 255.0f

    .line 22
    .line 23
    div-float/2addr p0, p1

    .line 24
    return p0

    .line 25
    :cond_0
    ushr-long/2addr p0, v1

    .line 26
    const-wide/32 v0, 0xffff

    .line 27
    .line 28
    .line 29
    and-long/2addr p0, v0

    .line 30
    long-to-int p0, p0

    .line 31
    int-to-short p0, p0

    .line 32
    const p1, 0xffff

    .line 33
    .line 34
    .line 35
    and-int/2addr p1, p0

    .line 36
    const v0, 0x8000

    .line 37
    .line 38
    .line 39
    and-int/2addr v0, p0

    .line 40
    ushr-int/lit8 p1, p1, 0xa

    .line 41
    .line 42
    const/16 v1, 0x1f

    .line 43
    .line 44
    and-int/2addr p1, v1

    .line 45
    and-int/lit16 p0, p0, 0x3ff

    .line 46
    .line 47
    if-nez p1, :cond_3

    .line 48
    .line 49
    if-eqz p0, :cond_2

    .line 50
    .line 51
    const/high16 p1, 0x3f000000    # 0.5f

    .line 52
    .line 53
    add-int/2addr p0, p1

    .line 54
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    sget p1, Ldefpackage/b81;->a:F

    .line 59
    .line 60
    sub-float/2addr p0, p1

    .line 61
    if-nez v0, :cond_1

    .line 62
    .line 63
    return p0

    .line 64
    :cond_1
    neg-float p0, p0

    .line 65
    return p0

    .line 66
    :cond_2
    const/4 p0, 0x0

    .line 67
    move p1, p0

    .line 68
    goto :goto_1

    .line 69
    :cond_3
    shl-int/lit8 p0, p0, 0xd

    .line 70
    .line 71
    if-ne p1, v1, :cond_5

    .line 72
    .line 73
    const/16 p1, 0xff

    .line 74
    .line 75
    if-eqz p0, :cond_4

    .line 76
    .line 77
    const/high16 v1, 0x400000

    .line 78
    .line 79
    or-int/2addr p0, v1

    .line 80
    :cond_4
    :goto_0
    move v4, p1

    .line 81
    move p1, p0

    .line 82
    move p0, v4

    .line 83
    goto :goto_1

    .line 84
    :cond_5
    add-int/lit8 p1, p1, 0x70

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :goto_1
    shl-int/lit8 v0, v0, 0x10

    .line 88
    .line 89
    shl-int/lit8 p0, p0, 0x17

    .line 90
    .line 91
    or-int/2addr p0, v0

    .line 92
    or-int/2addr p0, p1

    .line 93
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    return p0
.end method

.method public static h(J)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-static {p0, p1}, Ldefpackage/x40;->g(J)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p0, p1}, Ldefpackage/x40;->f(J)F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p0, p1}, Ldefpackage/x40;->e(J)F

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {p0, p1}, Ldefpackage/x40;->d(J)F

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const-wide/16 v4, 0x3f

    .line 18
    .line 19
    and-long/2addr p0, v4

    .line 20
    long-to-int p0, p0

    .line 21
    sget-object p1, Ldefpackage/s50;->y:[Ldefpackage/p50;

    .line 22
    .line 23
    aget-object p0, p1, p0

    .line 24
    .line 25
    iget-object p0, p0, Ldefpackage/p50;->a:Ljava/lang/String;

    .line 26
    .line 27
    const-string p1, "Color("

    .line 28
    .line 29
    const-string v4, ", "

    .line 30
    .line 31
    invoke-static {p1, v0, v4, v1, v4}, Ldefpackage/b11;->r(Ljava/lang/String;FLjava/lang/String;FLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v0, ")"

    .line 48
    .line 49
    invoke-static {p1, p0, v0}, Ldefpackage/b11;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Ldefpackage/x40;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    check-cast p1, Ldefpackage/x40;

    .line 7
    .line 8
    iget-wide v0, p1, Ldefpackage/x40;->a:J

    .line 9
    .line 10
    iget-wide p0, p0, Ldefpackage/x40;->a:J

    .line 11
    .line 12
    cmp-long p0, p0, v0

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    :goto_0
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_1
    const/4 p0, 0x1

    .line 19
    return p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-wide v0, p0, Ldefpackage/x40;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-wide v0, p0, Ldefpackage/x40;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ldefpackage/x40;->h(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
