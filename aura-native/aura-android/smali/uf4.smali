.class final Luf4;
.super Lgx2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgx2;"
    }
.end annotation


# instance fields
.field public final a:F

.field public final b:F

.field public final c:F

.field public final d:F


# direct methods
.method public constructor <init>(FFFF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Luf4;->a:F

    .line 5
    .line 6
    iput p2, p0, Luf4;->b:F

    .line 7
    .line 8
    iput p3, p0, Luf4;->c:F

    .line 9
    .line 10
    iput p4, p0, Luf4;->d:F

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final d()Lcx2;
    .locals 2

    .line 1
    new-instance v0, Lvf4;

    .line 2
    .line 3
    invoke-direct {v0}, Lcx2;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Luf4;->a:F

    .line 7
    .line 8
    iput v1, v0, Lvf4;->B:F

    .line 9
    .line 10
    iget v1, p0, Luf4;->b:F

    .line 11
    .line 12
    iput v1, v0, Lvf4;->C:F

    .line 13
    .line 14
    iget v1, p0, Luf4;->c:F

    .line 15
    .line 16
    iput v1, v0, Lvf4;->D:F

    .line 17
    .line 18
    iget p0, p0, Luf4;->d:F

    .line 19
    .line 20
    iput p0, v0, Lvf4;->E:F

    .line 21
    .line 22
    const/4 p0, 0x1

    .line 23
    iput-boolean p0, v0, Lvf4;->F:Z

    .line 24
    .line 25
    return-object v0
.end method

.method public final e(Lcx2;)V
    .locals 1

    .line 1
    check-cast p1, Lvf4;

    .line 2
    .line 3
    iget v0, p0, Luf4;->a:F

    .line 4
    .line 5
    iput v0, p1, Lvf4;->B:F

    .line 6
    .line 7
    iget v0, p0, Luf4;->b:F

    .line 8
    .line 9
    iput v0, p1, Lvf4;->C:F

    .line 10
    .line 11
    iget v0, p0, Luf4;->c:F

    .line 12
    .line 13
    iput v0, p1, Lvf4;->D:F

    .line 14
    .line 15
    iget p0, p0, Luf4;->d:F

    .line 16
    .line 17
    iput p0, p1, Lvf4;->E:F

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    iput-boolean p0, p1, Lvf4;->F:Z

    .line 21
    .line 22
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Luf4;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, Luf4;

    .line 11
    .line 12
    iget v1, p1, Luf4;->a:F

    .line 13
    .line 14
    iget v2, p0, Luf4;->a:F

    .line 15
    .line 16
    invoke-static {v2, v1}, Lku0;->b(FF)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    iget v1, p0, Luf4;->b:F

    .line 24
    .line 25
    iget v2, p1, Luf4;->b:F

    .line 26
    .line 27
    invoke-static {v1, v2}, Lku0;->b(FF)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_3

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    iget v1, p0, Luf4;->c:F

    .line 35
    .line 36
    iget v2, p1, Luf4;->c:F

    .line 37
    .line 38
    invoke-static {v1, v2}, Lku0;->b(FF)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_4

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_4
    iget p0, p0, Luf4;->d:F

    .line 46
    .line 47
    iget p1, p1, Luf4;->d:F

    .line 48
    .line 49
    invoke-static {p0, p1}, Lku0;->b(FF)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-nez p0, :cond_5

    .line 54
    .line 55
    :goto_0
    const/4 p0, 0x0

    .line 56
    return p0

    .line 57
    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Luf4;->a:F

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
    iget v2, p0, Luf4;->b:F

    .line 11
    .line 12
    invoke-static {v0, v2, v1}, Lb11;->d(IFI)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Luf4;->c:F

    .line 17
    .line 18
    invoke-static {v0, v2, v1}, Lb11;->d(IFI)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget p0, p0, Luf4;->d:F

    .line 23
    .line 24
    invoke-static {v0, p0, v1}, Lb11;->d(IFI)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    const/4 v0, 0x1

    .line 29
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    add-int/2addr v0, p0

    .line 34
    return v0
.end method
