.class public final Lym4;
.super Lq05;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final d:F

.field public final e:F

.field public final f:I

.field public final g:I


# direct methods
.method public constructor <init>(FFII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lym4;->d:F

    .line 5
    .line 6
    iput p2, p0, Lym4;->e:F

    .line 7
    .line 8
    iput p3, p0, Lym4;->f:I

    .line 9
    .line 10
    iput p4, p0, Lym4;->g:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lym4;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lym4;

    .line 12
    .line 13
    iget v1, p1, Lym4;->d:F

    .line 14
    .line 15
    iget v3, p0, Lym4;->d:F

    .line 16
    .line 17
    cmpg-float v1, v3, v1

    .line 18
    .line 19
    if-nez v1, :cond_2

    .line 20
    .line 21
    iget v1, p0, Lym4;->e:F

    .line 22
    .line 23
    iget v3, p1, Lym4;->e:F

    .line 24
    .line 25
    cmpg-float v1, v1, v3

    .line 26
    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    iget v1, p0, Lym4;->f:I

    .line 30
    .line 31
    iget v3, p1, Lym4;->f:I

    .line 32
    .line 33
    if-ne v1, v3, :cond_2

    .line 34
    .line 35
    iget p0, p0, Lym4;->g:I

    .line 36
    .line 37
    iget p1, p1, Lym4;->g:I

    .line 38
    .line 39
    if-ne p0, p1, :cond_2

    .line 40
    .line 41
    return v0

    .line 42
    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lym4;->d:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget v2, p0, Lym4;->e:F

    .line 11
    .line 12
    invoke-static {v0, v2, v1}, Lb11;->d(IFI)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lym4;->f:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Lf34;->d(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget p0, p0, Lym4;->g:I

    .line 23
    .line 24
    invoke-static {p0, v0, v1}, Lf34;->d(III)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    const-string v0, "Unknown"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const-string v2, "Round"

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    iget v4, p0, Lym4;->f:I

    .line 8
    .line 9
    if-nez v4, :cond_0

    .line 10
    .line 11
    const-string v4, "Butt"

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    if-ne v4, v3, :cond_1

    .line 15
    .line 16
    move-object v4, v2

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    if-ne v4, v1, :cond_2

    .line 19
    .line 20
    const-string v4, "Square"

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    move-object v4, v0

    .line 24
    :goto_0
    iget v5, p0, Lym4;->g:I

    .line 25
    .line 26
    if-nez v5, :cond_3

    .line 27
    .line 28
    const-string v0, "Miter"

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_3
    if-ne v5, v3, :cond_4

    .line 32
    .line 33
    move-object v0, v2

    .line 34
    goto :goto_1

    .line 35
    :cond_4
    if-ne v5, v1, :cond_5

    .line 36
    .line 37
    const-string v0, "Bevel"

    .line 38
    .line 39
    :cond_5
    :goto_1
    const-string v1, ", miter="

    .line 40
    .line 41
    const-string v2, ", cap="

    .line 42
    .line 43
    const-string v3, "Stroke(width="

    .line 44
    .line 45
    iget v5, p0, Lym4;->d:F

    .line 46
    .line 47
    iget p0, p0, Lym4;->e:F

    .line 48
    .line 49
    invoke-static {v3, v5, v1, p0, v2}, Lb11;->r(Ljava/lang/String;FLjava/lang/String;FLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v1, ", join="

    .line 57
    .line 58
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v0, ", pathEffect=null)"

    .line 65
    .line 66
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0
.end method
