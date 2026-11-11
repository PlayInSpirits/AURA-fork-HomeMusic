.class final Lid3;
.super Lgx2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgx2;"
    }
.end annotation


# instance fields
.field public final a:Lhd3;

.field public final b:Lhs;

.field public final c:Li80;

.field public final d:F

.field public final e:Ldt;


# direct methods
.method public constructor <init>(Lhd3;Lhs;Li80;FLdt;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lid3;->a:Lhd3;

    .line 5
    .line 6
    iput-object p2, p0, Lid3;->b:Lhs;

    .line 7
    .line 8
    iput-object p3, p0, Lid3;->c:Li80;

    .line 9
    .line 10
    iput p4, p0, Lid3;->d:F

    .line 11
    .line 12
    iput-object p5, p0, Lid3;->e:Ldt;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final d()Lcx2;
    .locals 2

    .line 1
    new-instance v0, Ljd3;

    .line 2
    .line 3
    invoke-direct {v0}, Lcx2;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lid3;->a:Lhd3;

    .line 7
    .line 8
    iput-object v1, v0, Ljd3;->B:Lhd3;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    iput-boolean v1, v0, Ljd3;->C:Z

    .line 12
    .line 13
    iget-object v1, p0, Lid3;->b:Lhs;

    .line 14
    .line 15
    iput-object v1, v0, Ljd3;->D:Lhs;

    .line 16
    .line 17
    iget-object v1, p0, Lid3;->c:Li80;

    .line 18
    .line 19
    iput-object v1, v0, Ljd3;->E:Li80;

    .line 20
    .line 21
    iget v1, p0, Lid3;->d:F

    .line 22
    .line 23
    iput v1, v0, Ljd3;->F:F

    .line 24
    .line 25
    iget-object p0, p0, Lid3;->e:Ldt;

    .line 26
    .line 27
    iput-object p0, v0, Ljd3;->G:Ldt;

    .line 28
    .line 29
    return-object v0
.end method

.method public final e(Lcx2;)V
    .locals 7

    .line 1
    check-cast p1, Ljd3;

    .line 2
    .line 3
    iget-boolean v0, p1, Ljd3;->C:Z

    .line 4
    .line 5
    iget-object v1, p0, Lid3;->a:Lhd3;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-ne v0, v2, :cond_1

    .line 9
    .line 10
    iget-object v0, p1, Ljd3;->B:Lhd3;

    .line 11
    .line 12
    invoke-virtual {v0}, Lhd3;->d()J

    .line 13
    .line 14
    .line 15
    move-result-wide v3

    .line 16
    invoke-virtual {v1}, Lhd3;->d()J

    .line 17
    .line 18
    .line 19
    move-result-wide v5

    .line 20
    invoke-static {v3, v4, v5, v6}, Lqf4;->a(JJ)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    :goto_0
    move v0, v2

    .line 30
    :goto_1
    iput-object v1, p1, Ljd3;->B:Lhd3;

    .line 31
    .line 32
    iput-boolean v2, p1, Ljd3;->C:Z

    .line 33
    .line 34
    iget-object v1, p0, Lid3;->b:Lhs;

    .line 35
    .line 36
    iput-object v1, p1, Ljd3;->D:Lhs;

    .line 37
    .line 38
    iget-object v1, p0, Lid3;->c:Li80;

    .line 39
    .line 40
    iput-object v1, p1, Ljd3;->E:Li80;

    .line 41
    .line 42
    iget v1, p0, Lid3;->d:F

    .line 43
    .line 44
    iput v1, p1, Ljd3;->F:F

    .line 45
    .line 46
    iget-object p0, p0, Lid3;->e:Ldt;

    .line 47
    .line 48
    iput-object p0, p1, Ljd3;->G:Ldt;

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    invoke-static {p1}, Lg12;->A(Lu62;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    invoke-static {p1}, Ljz4;->z(Lrv0;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lid3;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lid3;

    .line 10
    .line 11
    iget-object v0, p0, Lid3;->a:Lhd3;

    .line 12
    .line 13
    iget-object v1, p1, Lid3;->a:Lhd3;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object v0, p0, Lid3;->b:Lhs;

    .line 23
    .line 24
    iget-object v1, p1, Lid3;->b:Lhs;

    .line 25
    .line 26
    invoke-static {v0, v1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget-object v0, p0, Lid3;->c:Li80;

    .line 34
    .line 35
    iget-object v1, p1, Lid3;->c:Li80;

    .line 36
    .line 37
    invoke-static {v0, v1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    iget v0, p0, Lid3;->d:F

    .line 45
    .line 46
    iget v1, p1, Lid3;->d:F

    .line 47
    .line 48
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_5

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_5
    iget-object p0, p0, Lid3;->e:Ldt;

    .line 56
    .line 57
    iget-object p1, p1, Lid3;->e:Ldt;

    .line 58
    .line 59
    invoke-static {p0, p1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-nez p0, :cond_6

    .line 64
    .line 65
    :goto_0
    const/4 p0, 0x0

    .line 66
    return p0

    .line 67
    :cond_6
    :goto_1
    const/4 p0, 0x1

    .line 68
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lid3;->a:Lhd3;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

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
    const/4 v2, 0x1

    .line 11
    invoke-static {v0, v1, v2}, Lxa3;->c(IIZ)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object v2, p0, Lid3;->b:Lhs;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    add-int/2addr v2, v0

    .line 22
    mul-int/2addr v2, v1

    .line 23
    iget-object v0, p0, Lid3;->c:Li80;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    add-int/2addr v0, v2

    .line 30
    mul-int/2addr v0, v1

    .line 31
    iget v2, p0, Lid3;->d:F

    .line 32
    .line 33
    invoke-static {v0, v2, v1}, Lb11;->d(IFI)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget-object p0, p0, Lid3;->e:Ldt;

    .line 38
    .line 39
    if-nez p0, :cond_0

    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    :goto_0
    add-int/2addr v0, p0

    .line 48
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "PainterElement(painter="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lid3;->a:Lhd3;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", sizeToIntrinsics=true, alignment="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lid3;->b:Lhs;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", contentScale="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lid3;->c:Li80;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", alpha="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget v1, p0, Lid3;->d:F

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", colorFilter="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, Lid3;->e:Ldt;

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string p0, ")"

    .line 54
    .line 55
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method
