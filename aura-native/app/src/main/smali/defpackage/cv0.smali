.class public final synthetic Ldefpackage/cv0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/if1;


# instance fields
.field public final synthetic n:F

.field public final synthetic o:Ldefpackage/fx3;


# direct methods
.method public synthetic constructor <init>(FLdefpackage/fx3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ldefpackage/cv0;->n:F

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/cv0;->o:Ldefpackage/fx3;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Ldefpackage/mv0;

    .line 2
    .line 3
    invoke-interface {p1}, Ldefpackage/ih1;->A()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "waiting"

    .line 8
    .line 9
    invoke-static {v0, v1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-interface {p1}, Ldefpackage/mv0;->F()Ldefpackage/hb3;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x1

    .line 18
    const/4 v3, 0x0

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    :cond_0
    move p1, v3

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    invoke-interface {p1}, Ldefpackage/mv0;->F()Ldefpackage/hb3;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    sget v1, Ldefpackage/ov0;->a:I

    .line 31
    .line 32
    sget-object v1, Ldefpackage/hb3;->o:Ldefpackage/hb3;

    .line 33
    .line 34
    iget v4, p0, Ldefpackage/cv0;->n:F

    .line 35
    .line 36
    const/high16 v5, 0x41f00000    # 30.0f

    .line 37
    .line 38
    if-ne p1, v1, :cond_2

    .line 39
    .line 40
    cmpg-float p1, v4, v5

    .line 41
    .line 42
    if-gtz p1, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    cmpl-float p1, v4, v5

    .line 46
    .line 47
    if-lez p1, :cond_0

    .line 48
    .line 49
    const/high16 p1, 0x42b40000    # 90.0f

    .line 50
    .line 51
    cmpg-float p1, v4, p1

    .line 52
    .line 53
    if-gtz p1, :cond_0

    .line 54
    .line 55
    :goto_0
    move p1, v2

    .line 56
    :goto_1
    iget-object p0, p0, Ldefpackage/cv0;->o:Ldefpackage/fx3;

    .line 57
    .line 58
    iget-boolean v1, p0, Ldefpackage/fx3;->n:Z

    .line 59
    .line 60
    if-nez v1, :cond_3

    .line 61
    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    if-eqz p1, :cond_4

    .line 65
    .line 66
    :cond_3
    move v3, v2

    .line 67
    :cond_4
    iput-boolean v3, p0, Ldefpackage/fx3;->n:Z

    .line 68
    .line 69
    xor-int/lit8 p0, v3, 0x1

    .line 70
    .line 71
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0
.end method
