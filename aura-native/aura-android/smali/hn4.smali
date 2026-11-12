.class public final synthetic Lhn4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lkn4;


# direct methods
.method public synthetic constructor <init>(Lkn4;I)V
    .locals 0

    .line 1
    iput p2, p0, Lhn4;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lhn4;->o:Lkn4;

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
    iget v0, p0, Lhn4;->n:I

    .line 2
    .line 3
    sget-object v1, Lj15;->a:Lj15;

    .line 4
    .line 5
    iget-object p0, p0, Lhn4;->o:Lkn4;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Lc72;

    .line 11
    .line 12
    check-cast p2, Lwf1;

    .line 13
    .line 14
    invoke-virtual {p0}, Lkn4;->a()Lo72;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    new-instance v0, Ll72;

    .line 19
    .line 20
    invoke-direct {v0, p0, p2}, Ll72;-><init>(Lo72;Lwf1;)V

    .line 21
    .line 22
    .line 23
    iget-object p0, p1, Lc72;->I:Lui2;

    .line 24
    .line 25
    invoke-static {p0, v0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-nez p0, :cond_0

    .line 30
    .line 31
    iput-object v0, p1, Lc72;->I:Lui2;

    .line 32
    .line 33
    invoke-virtual {p1}, Lc72;->D()V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-object v1

    .line 37
    :pswitch_0
    check-cast p1, Lc72;

    .line 38
    .line 39
    check-cast p2, Lu80;

    .line 40
    .line 41
    invoke-virtual {p0}, Lkn4;->a()Lo72;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    iput-object p2, p0, Lo72;->o:Lu80;

    .line 46
    .line 47
    return-object v1

    .line 48
    :pswitch_1
    iget-object v0, p0, Lkn4;->a:Lwo0;

    .line 49
    .line 50
    check-cast p1, Lc72;

    .line 51
    .line 52
    check-cast p2, Lkn4;

    .line 53
    .line 54
    iget-object p2, p1, Lc72;->S:Lo72;

    .line 55
    .line 56
    if-nez p2, :cond_1

    .line 57
    .line 58
    new-instance p2, Lo72;

    .line 59
    .line 60
    invoke-direct {p2, p1, v0}, Lo72;-><init>(Lc72;Lwo0;)V

    .line 61
    .line 62
    .line 63
    iput-object p2, p1, Lc72;->S:Lo72;

    .line 64
    .line 65
    :cond_1
    iput-object p2, p0, Lkn4;->b:Lo72;

    .line 66
    .line 67
    invoke-virtual {p0}, Lkn4;->a()Lo72;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p1}, Lo72;->h()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Lkn4;->a()Lo72;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    iget-object p1, p0, Lo72;->p:Lwo0;

    .line 79
    .line 80
    if-eq p1, v0, :cond_2

    .line 81
    .line 82
    iput-object v0, p0, Lo72;->p:Lwo0;

    .line 83
    .line 84
    const/4 p1, 0x0

    .line 85
    invoke-virtual {p0, p1}, Lo72;->i(Z)V

    .line 86
    .line 87
    .line 88
    iget-object p0, p0, Lo72;->n:Lc72;

    .line 89
    .line 90
    const/4 p2, 0x7

    .line 91
    invoke-static {p0, p1, p2}, Lc72;->W(Lc72;ZI)V

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
