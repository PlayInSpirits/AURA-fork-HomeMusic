.class public final synthetic Lmr1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lwz2;


# direct methods
.method public synthetic constructor <init>(Lwz2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lmr1;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lmr1;->o:Lwz2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lmr1;->n:I

    .line 2
    .line 3
    const-string v1, "POST"

    .line 4
    .line 5
    iget-object p0, p0, Lmr1;->o:Lwz2;

    .line 6
    .line 7
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lb11;->f(Ljava/lang/String;)Lnz3;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v2, "/api/uploads"

    .line 17
    .line 18
    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {v0, p1}, Lnz3;->d(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1, p0}, Lnz3;->b(Ljava/lang/String;Ltz3;)V

    .line 26
    .line 27
    .line 28
    new-instance p0, Loz3;

    .line 29
    .line 30
    invoke-direct {p0, v0}, Loz3;-><init>(Lnz3;)V

    .line 31
    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_0
    invoke-static {p1}, Lb11;->f(Ljava/lang/String;)Lnz3;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v2, "/api/assistant/tasks"

    .line 39
    .line 40
    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {v0, p1}, Lnz3;->d(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1, p0}, Lnz3;->b(Ljava/lang/String;Ltz3;)V

    .line 48
    .line 49
    .line 50
    new-instance p0, Loz3;

    .line 51
    .line 52
    invoke-direct {p0, v0}, Loz3;-><init>(Lnz3;)V

    .line 53
    .line 54
    .line 55
    return-object p0

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
