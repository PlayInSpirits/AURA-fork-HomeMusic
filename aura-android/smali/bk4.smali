.class public final Lbk4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:F

.field public b:D


# virtual methods
.method public final a(FFJ)J
    .locals 6

    .line 1
    iget v0, p0, Lbk4;->a:F

    .line 2
    .line 3
    sub-float/2addr p1, v0

    .line 4
    long-to-double p3, p3

    .line 5
    const-wide v0, 0x408f400000000000L    # 1000.0

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    div-double/2addr p3, v0

    .line 11
    iget-wide v0, p0, Lbk4;->b:D

    .line 12
    .line 13
    float-to-double v2, p2

    .line 14
    float-to-double p1, p1

    .line 15
    mul-double v4, v0, p1

    .line 16
    .line 17
    add-double/2addr v4, v2

    .line 18
    neg-double v0, v0

    .line 19
    mul-double/2addr v0, p3

    .line 20
    mul-double/2addr p3, v4

    .line 21
    add-double/2addr p3, p1

    .line 22
    invoke-static {v0, v1}, Ljava/lang/Math;->exp(D)D

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    mul-double/2addr p1, p3

    .line 27
    invoke-static {v0, v1}, Ljava/lang/Math;->exp(D)D

    .line 28
    .line 29
    .line 30
    move-result-wide v2

    .line 31
    mul-double/2addr v2, p3

    .line 32
    iget-wide p3, p0, Lbk4;->b:D

    .line 33
    .line 34
    neg-double p3, p3

    .line 35
    mul-double/2addr v2, p3

    .line 36
    invoke-static {v0, v1}, Ljava/lang/Math;->exp(D)D

    .line 37
    .line 38
    .line 39
    move-result-wide p3

    .line 40
    mul-double/2addr p3, v4

    .line 41
    add-double/2addr p3, v2

    .line 42
    iget p0, p0, Lbk4;->a:F

    .line 43
    .line 44
    float-to-double v0, p0

    .line 45
    add-double/2addr p1, v0

    .line 46
    double-to-float p0, p1

    .line 47
    double-to-float p1, p3

    .line 48
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    int-to-long p2, p0

    .line 53
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    int-to-long p0, p0

    .line 58
    const/16 p4, 0x20

    .line 59
    .line 60
    shl-long/2addr p2, p4

    .line 61
    const-wide v0, 0xffffffffL

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    and-long/2addr p0, v0

    .line 67
    or-long/2addr p0, p2

    .line 68
    return-wide p0
.end method
