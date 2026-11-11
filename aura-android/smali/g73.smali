.class public final Lg73;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lq81;


# instance fields
.field public final synthetic n:Llm0;

.field public final synthetic o:Z

.field public final synthetic p:Lb13;

.field public final synthetic q:Lb13;

.field public final synthetic r:Lb13;

.field public final synthetic s:Lb13;


# direct methods
.method public constructor <init>(Llm0;ZLb13;Lb13;Lb13;Lb13;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg73;->n:Llm0;

    .line 5
    .line 6
    iput-boolean p2, p0, Lg73;->o:Z

    .line 7
    .line 8
    iput-object p3, p0, Lg73;->p:Lb13;

    .line 9
    .line 10
    iput-object p4, p0, Lg73;->q:Lb13;

    .line 11
    .line 12
    iput-object p5, p0, Lg73;->r:Lb13;

    .line 13
    .line 14
    iput-object p6, p0, Lg73;->s:Lb13;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lvd0;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    sget-object p2, Lj15;->a:Lj15;

    .line 8
    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    iget-object p1, p0, Lg73;->p:Lb13;

    .line 12
    .line 13
    invoke-interface {p1}, Lkl4;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-interface {p1, v0}, Lb13;->setValue(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lg73;->n:Llm0;

    .line 32
    .line 33
    invoke-virtual {p1}, Lad3;->k()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iget-boolean v0, p0, Lg73;->o:Z

    .line 38
    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    if-ltz p1, :cond_1

    .line 42
    .line 43
    iget-object v0, p0, Lg73;->q:Lb13;

    .line 44
    .line 45
    invoke-interface {v0}, Lkl4;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Ljava/lang/Number;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-ge p1, v0, :cond_1

    .line 56
    .line 57
    iget-object v0, p0, Lg73;->r:Lb13;

    .line 58
    .line 59
    invoke-interface {v0}, Lkl4;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Ljava/lang/Number;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eq p1, v0, :cond_1

    .line 70
    .line 71
    iget-object p0, p0, Lg73;->s:Lb13;

    .line 72
    .line 73
    invoke-interface {p0}, Lkl4;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, Lif1;

    .line 78
    .line 79
    new-instance v0, Ljava/lang/Integer;

    .line 80
    .line 81
    invoke-direct {v0, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 82
    .line 83
    .line 84
    invoke-interface {p0, v0}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    :cond_1
    :goto_0
    return-object p2
.end method
