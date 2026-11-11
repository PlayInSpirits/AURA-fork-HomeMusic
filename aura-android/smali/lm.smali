.class public final synthetic Llm;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:I

.field public final synthetic p:J

.field public final synthetic q:J

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;IJJI)V
    .locals 0

    .line 1
    iput p7, p0, Llm;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Llm;->r:Ljava/lang/Object;

    .line 4
    .line 5
    iput p2, p0, Llm;->o:I

    .line 6
    .line 7
    iput-wide p3, p0, Llm;->p:J

    .line 8
    .line 9
    iput-wide p5, p0, Llm;->q:J

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, Llm;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Llm;->r:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v1, Lbp;

    .line 9
    .line 10
    iget-object v0, v1, Lbp;->b:Lnj0;

    .line 11
    .line 12
    iget-object v1, v0, Lnj0;->q:Lml3;

    .line 13
    .line 14
    iget-object v2, v1, Lml3;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Lyw1;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v1, v1, Lml3;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lyw1;

    .line 29
    .line 30
    invoke-static {v1}, Lte5;->w(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lmt2;

    .line 35
    .line 36
    :goto_0
    invoke-virtual {v0, v1}, Lnj0;->X(Lmt2;)Lq9;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    new-instance v2, Llj0;

    .line 41
    .line 42
    iget v4, p0, Llm;->o:I

    .line 43
    .line 44
    iget-wide v5, p0, Llm;->p:J

    .line 45
    .line 46
    iget-wide v7, p0, Llm;->q:J

    .line 47
    .line 48
    invoke-direct/range {v2 .. v8}, Llj0;-><init>(Lq9;IJJ)V

    .line 49
    .line 50
    .line 51
    const/16 p0, 0x3ee

    .line 52
    .line 53
    invoke-virtual {v0, v3, p0, v2}, Lnj0;->b0(Lq9;ILqc2;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_0
    check-cast v1, Lxc5;

    .line 58
    .line 59
    iget-object v0, v1, Lxc5;->p:Ljava/lang/Object;

    .line 60
    .line 61
    move-object v1, v0

    .line 62
    check-cast v1, Lqm;

    .line 63
    .line 64
    sget-object v0, Lf35;->a:Ljava/lang/String;

    .line 65
    .line 66
    iget v2, p0, Llm;->o:I

    .line 67
    .line 68
    iget-wide v3, p0, Llm;->p:J

    .line 69
    .line 70
    iget-wide v5, p0, Llm;->q:J

    .line 71
    .line 72
    invoke-interface/range {v1 .. v6}, Lqm;->S(IJJ)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
