.class public final Ldefpackage/zh4;
.super Ldefpackage/uo;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final u:J


# direct methods
.method public constructor <init>(J)V
    .locals 1

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-direct {p0, v0}, Ldefpackage/uo;-><init>(I)V

    .line 3
    .line 4
    .line 5
    iput-wide p1, p0, Ldefpackage/zh4;->u:J

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final d(JLdefpackage/gc;F)V
    .locals 2

    .line 1
    const/high16 p1, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-virtual {p3, p1}, Ldefpackage/gc;->d(F)V

    .line 4
    .line 5
    .line 6
    cmpg-float p1, p4, p1

    .line 7
    .line 8
    iget-wide v0, p0, Ldefpackage/zh4;->u:J

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {v0, v1}, Ldefpackage/x40;->d(J)F

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    mul-float/2addr p0, p4

    .line 18
    invoke-static {v0, v1, p0}, Ldefpackage/x40;->b(JF)J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    :goto_0
    invoke-virtual {p3, v0, v1}, Ldefpackage/gc;->f(J)V

    .line 23
    .line 24
    .line 25
    iget-object p0, p3, Ldefpackage/gc;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Landroid/graphics/Shader;

    .line 28
    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    iput-object p0, p3, Ldefpackage/gc;->c:Ljava/lang/Object;

    .line 33
    .line 34
    iget-object p1, p3, Ldefpackage/gc;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, Landroid/graphics/Paint;

    .line 37
    .line 38
    invoke-virtual {p1, p0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Ldefpackage/zh4;

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
    check-cast p1, Ldefpackage/zh4;

    .line 12
    .line 13
    iget-wide v3, p1, Ldefpackage/zh4;->u:J

    .line 14
    .line 15
    iget-wide p0, p0, Ldefpackage/zh4;->u:J

    .line 16
    .line 17
    invoke-static {p0, p1, v3, v4}, Ldefpackage/x40;->c(JJ)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    sget v0, Ldefpackage/x40;->h:I

    .line 2
    .line 3
    iget-wide v0, p0, Ldefpackage/zh4;->u:J

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-wide v0, p0, Ldefpackage/zh4;->u:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ldefpackage/x40;->h(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "SolidColor(value="

    .line 8
    .line 9
    const-string v1, ")"

    .line 10
    .line 11
    invoke-static {v0, p0, v1}, Ldefpackage/xa3;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method
