.class public final synthetic Lmp1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements La83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Lk03;

.field public final synthetic d:Lhd;


# direct methods
.method public synthetic constructor <init>(Lhd;ILk03;I)V
    .locals 0

    .line 1
    iput p4, p0, Lmp1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lmp1;->d:Lhd;

    .line 4
    .line 5
    iput p2, p0, Lmp1;->b:I

    .line 6
    .line 7
    iput-object p3, p0, Lmp1;->c:Lk03;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Lmp1;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lmp1;->c:Lk03;

    .line 4
    .line 5
    iget v2, p0, Lmp1;->b:I

    .line 6
    .line 7
    iget-object p0, p0, Lmp1;->d:Lhd;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Ln92;

    .line 13
    .line 14
    iget p0, p0, Ln92;->n:I

    .line 15
    .line 16
    if-ne v2, p0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Lad2;->k(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void

    .line 22
    :pswitch_0
    check-cast p0, Lcom/eddyizm/tempus/viewmodel/b;

    .line 23
    .line 24
    iget p0, p0, Lcom/eddyizm/tempus/viewmodel/b;->F:I

    .line 25
    .line 26
    if-ne v2, p0, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1, p1}, Lad2;->k(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
