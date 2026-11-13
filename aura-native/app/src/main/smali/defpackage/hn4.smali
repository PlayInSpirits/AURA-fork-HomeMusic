.class public final synthetic Ldefpackage/hn4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/wf1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ldefpackage/kn4;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/kn4;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/hn4;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/hn4;->o:Ldefpackage/kn4;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/hn4;->n:I

    .line 2
    .line 3
    sget-object v1, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/hn4;->o:Ldefpackage/kn4;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ldefpackage/c72;

    .line 11
    .line 12
    check-cast p2, Ldefpackage/wf1;

    .line 13
    .line 14
    invoke-virtual {p0}, Ldefpackage/kn4;->a()Ldefpackage/o72;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    new-instance v0, Ldefpackage/l72;

    .line 19
    .line 20
    invoke-direct {v0, p0, p2}, Ldefpackage/l72;-><init>(Ldefpackage/o72;Ldefpackage/wf1;)V

    .line 21
    .line 22
    .line 23
    iget-object p0, p1, Ldefpackage/c72;->I:Ldefpackage/ui2;

    .line 24
    .line 25
    invoke-static {p0, v0}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-nez p0, :cond_0

    .line 30
    .line 31
    iput-object v0, p1, Ldefpackage/c72;->I:Ldefpackage/ui2;

    .line 32
    .line 33
    invoke-virtual {p1}, Ldefpackage/c72;->D()V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-object v1

    .line 37
    :pswitch_0
    check-cast p1, Ldefpackage/c72;

    .line 38
    .line 39
    check-cast p2, Ldefpackage/u80;

    .line 40
    .line 41
    invoke-virtual {p0}, Ldefpackage/kn4;->a()Ldefpackage/o72;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    iput-object p2, p0, Ldefpackage/o72;->o:Ldefpackage/u80;

    .line 46
    .line 47
    return-object v1

    .line 48
    :pswitch_1
    iget-object v0, p0, Ldefpackage/kn4;->a:Ldefpackage/wo0;

    .line 49
    .line 50
    check-cast p1, Ldefpackage/c72;

    .line 51
    .line 52
    check-cast p2, Ldefpackage/kn4;

    .line 53
    .line 54
    iget-object p2, p1, Ldefpackage/c72;->S:Ldefpackage/o72;

    .line 55
    .line 56
    if-nez p2, :cond_1

    .line 57
    .line 58
    new-instance p2, Ldefpackage/o72;

    .line 59
    .line 60
    invoke-direct {p2, p1, v0}, Ldefpackage/o72;-><init>(Ldefpackage/c72;Ldefpackage/wo0;)V

    .line 61
    .line 62
    .line 63
    iput-object p2, p1, Ldefpackage/c72;->S:Ldefpackage/o72;

    .line 64
    .line 65
    :cond_1
    iput-object p2, p0, Ldefpackage/kn4;->b:Ldefpackage/o72;

    .line 66
    .line 67
    invoke-virtual {p0}, Ldefpackage/kn4;->a()Ldefpackage/o72;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p1}, Ldefpackage/o72;->h()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Ldefpackage/kn4;->a()Ldefpackage/o72;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    iget-object p1, p0, Ldefpackage/o72;->p:Ldefpackage/wo0;

    .line 79
    .line 80
    if-eq p1, v0, :cond_2

    .line 81
    .line 82
    iput-object v0, p0, Ldefpackage/o72;->p:Ldefpackage/wo0;

    .line 83
    .line 84
    const/4 p1, 0x0

    .line 85
    invoke-virtual {p0, p1}, Ldefpackage/o72;->i(Z)V

    .line 86
    .line 87
    .line 88
    iget-object p0, p0, Ldefpackage/o72;->n:Ldefpackage/c72;

    .line 89
    .line 90
    const/4 p2, 0x7

    .line 91
    invoke-static {p0, p1, p2}, Ldefpackage/c72;->W(Ldefpackage/c72;ZI)V

    .line 92
    .line 93
    .line 94
    :cond_2
    return-object v1

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
