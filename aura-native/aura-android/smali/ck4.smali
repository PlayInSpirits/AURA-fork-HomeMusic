.class public final Lck4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwd;


# instance fields
.field public final a:F

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(FLjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lck4;->a:F

    .line 5
    .line 6
    iput-object p2, p0, Lck4;->b:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Lg45;
    .locals 3

    .line 1
    new-instance v0, Lc05;

    .line 2
    .line 3
    iget-object v1, p0, Lck4;->b:Ljava/lang/Object;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object v2, Lp35;->a:Lhd5;

    .line 10
    .line 11
    iget-object v2, v2, Lhd5;->o:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Lif1;

    .line 14
    .line 15
    invoke-interface {v2, v1}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lce;

    .line 20
    .line 21
    :goto_0
    sget v2, Li45;->a:I

    .line 22
    .line 23
    iget p0, p0, Lck4;->a:F

    .line 24
    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    const v2, 0x44bb8000    # 1500.0f

    .line 28
    .line 29
    .line 30
    cmpg-float v2, p0, v2

    .line 31
    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    sget-object p0, Lym0;->n:Lym0;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    if-eqz v1, :cond_2

    .line 38
    .line 39
    new-instance v2, Lrm2;

    .line 40
    .line 41
    invoke-direct {v2, v1, p0}, Lrm2;-><init>(Lce;F)V

    .line 42
    .line 43
    .line 44
    move-object p0, v2

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    new-instance v1, Lh45;

    .line 47
    .line 48
    invoke-direct {v1, p0}, Lh45;-><init>(F)V

    .line 49
    .line 50
    .line 51
    move-object p0, v1

    .line 52
    :goto_1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 53
    .line 54
    .line 55
    new-instance v1, Lss0;

    .line 56
    .line 57
    invoke-direct {v1, p0}, Lss0;-><init>(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iput-object v1, v0, Lc05;->n:Ljava/lang/Object;

    .line 61
    .line 62
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lck4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lck4;

    .line 6
    .line 7
    iget v0, p1, Lck4;->a:F

    .line 8
    .line 9
    iget v1, p0, Lck4;->a:F

    .line 10
    .line 11
    cmpg-float v0, v0, v1

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object p1, p1, Lck4;->b:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object p0, p0, Lck4;->b:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {p1, p0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lck4;->b:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    const/16 v1, 0x1f

    .line 12
    .line 13
    mul-int/2addr v0, v1

    .line 14
    const/high16 v2, 0x3f800000    # 1.0f

    .line 15
    .line 16
    invoke-static {v0, v2, v1}, Lb11;->d(IFI)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget p0, p0, Lck4;->a:F

    .line 21
    .line 22
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    add-int/2addr p0, v0

    .line 27
    return p0
.end method
