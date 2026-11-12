.class public final synthetic Lic3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:Z

.field public final synthetic o:Llm0;

.field public final synthetic p:Lwe0;


# direct methods
.method public synthetic constructor <init>(ZLlm0;Lwe0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lic3;->n:Z

    .line 5
    .line 6
    iput-object p2, p0, Lic3;->o:Llm0;

    .line 7
    .line 8
    iput-object p3, p0, Lic3;->p:Lwe0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, Lq94;

    .line 2
    .line 3
    iget-boolean v0, p0, Lic3;->n:Z

    .line 4
    .line 5
    iget-object v1, p0, Lic3;->o:Llm0;

    .line 6
    .line 7
    iget-object p0, p0, Lic3;->p:Lwe0;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Ljc3;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-direct {v0, v1, p0, v3}, Ljc3;-><init>(Llm0;Lwe0;I)V

    .line 16
    .line 17
    .line 18
    sget-object v3, Lo94;->a:[Lc42;

    .line 19
    .line 20
    sget-object v3, Ld94;->x:Lp94;

    .line 21
    .line 22
    new-instance v4, Lw2;

    .line 23
    .line 24
    invoke-direct {v4, v2, v0}, Lw2;-><init>(Ljava/lang/String;Lsf1;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1, v3, v4}, Lq94;->a(Lp94;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    new-instance v0, Ljc3;

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    invoke-direct {v0, v1, p0, v3}, Ljc3;-><init>(Llm0;Lwe0;I)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Ld94;->z:Lp94;

    .line 37
    .line 38
    new-instance v1, Lw2;

    .line 39
    .line 40
    invoke-direct {v1, v2, v0}, Lw2;-><init>(Ljava/lang/String;Lsf1;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p1, p0, v1}, Lq94;->a(Lp94;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    new-instance v0, Ljc3;

    .line 48
    .line 49
    const/4 v3, 0x2

    .line 50
    invoke-direct {v0, v1, p0, v3}, Ljc3;-><init>(Llm0;Lwe0;I)V

    .line 51
    .line 52
    .line 53
    sget-object v3, Lo94;->a:[Lc42;

    .line 54
    .line 55
    sget-object v3, Ld94;->y:Lp94;

    .line 56
    .line 57
    new-instance v4, Lw2;

    .line 58
    .line 59
    invoke-direct {v4, v2, v0}, Lw2;-><init>(Ljava/lang/String;Lsf1;)V

    .line 60
    .line 61
    .line 62
    invoke-interface {p1, v3, v4}, Lq94;->a(Lp94;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    new-instance v0, Ljc3;

    .line 66
    .line 67
    const/4 v3, 0x3

    .line 68
    invoke-direct {v0, v1, p0, v3}, Ljc3;-><init>(Llm0;Lwe0;I)V

    .line 69
    .line 70
    .line 71
    sget-object p0, Ld94;->A:Lp94;

    .line 72
    .line 73
    new-instance v1, Lw2;

    .line 74
    .line 75
    invoke-direct {v1, v2, v0}, Lw2;-><init>(Ljava/lang/String;Lsf1;)V

    .line 76
    .line 77
    .line 78
    invoke-interface {p1, p0, v1}, Lq94;->a(Lp94;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :goto_0
    sget-object p0, Lj15;->a:Lj15;

    .line 82
    .line 83
    return-object p0
.end method
