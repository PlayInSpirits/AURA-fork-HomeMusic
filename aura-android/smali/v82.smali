.class public final synthetic Lv82;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lgf1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lx82;


# direct methods
.method public synthetic constructor <init>(Lx82;I)V
    .locals 0

    .line 1
    iput p2, p0, Lv82;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lv82;->o:Lx82;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lv82;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Lv82;->o:Lx82;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lx82;->C:Ls82;

    .line 9
    .line 10
    iget-object v0, v0, Ls82;->a:Llm0;

    .line 11
    .line 12
    invoke-virtual {v0}, Lad3;->m()Lqc3;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object v1, v1, Lqc3;->e:Lhb3;

    .line 17
    .line 18
    sget-object v2, Lhb3;->n:Lhb3;

    .line 19
    .line 20
    if-ne v1, v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Lad3;->m()Lqc3;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Lqc3;->i()J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    const-wide v2, 0xffffffffL

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    and-long/2addr v0, v2

    .line 36
    :goto_0
    long-to-int v0, v0

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    invoke-virtual {v0}, Lad3;->m()Lqc3;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Lqc3;->i()J

    .line 43
    .line 44
    .line 45
    move-result-wide v0

    .line 46
    const/16 v2, 0x20

    .line 47
    .line 48
    shr-long/2addr v0, v2

    .line 49
    goto :goto_0

    .line 50
    :goto_1
    iget-object p0, p0, Lx82;->C:Ls82;

    .line 51
    .line 52
    iget-object p0, p0, Ls82;->a:Llm0;

    .line 53
    .line 54
    invoke-virtual {p0}, Lad3;->m()Lqc3;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iget v1, v1, Lqc3;->f:I

    .line 59
    .line 60
    neg-int v1, v1

    .line 61
    invoke-virtual {p0}, Lad3;->m()Lqc3;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    iget p0, p0, Lqc3;->d:I

    .line 66
    .line 67
    add-int/2addr v1, p0

    .line 68
    sub-int/2addr v0, v1

    .line 69
    int-to-float p0, v0

    .line 70
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :pswitch_0
    iget-object p0, p0, Lx82;->C:Ls82;

    .line 76
    .line 77
    iget-object p0, p0, Ls82;->a:Llm0;

    .line 78
    .line 79
    invoke-virtual {p0}, Lad3;->m()Lqc3;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {p0}, Llm0;->n()I

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    invoke-static {v0, p0}, Led3;->a(Lqc3;I)J

    .line 88
    .line 89
    .line 90
    move-result-wide v0

    .line 91
    long-to-float p0, v0

    .line 92
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :pswitch_1
    iget-object p0, p0, Lx82;->C:Ls82;

    .line 98
    .line 99
    iget-object p0, p0, Ls82;->a:Llm0;

    .line 100
    .line 101
    invoke-static {p0}, Le35;->t(Lad3;)J

    .line 102
    .line 103
    .line 104
    move-result-wide v0

    .line 105
    long-to-float p0, v0

    .line 106
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
