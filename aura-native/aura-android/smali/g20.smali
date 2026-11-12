.class public final synthetic Lg20;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lg20;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lg20;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    .line 1
    iget v0, p0, Lg20;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lg20;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lfl3;

    .line 9
    .line 10
    iget-object p0, p0, Lfl3;->C0:Lgl3;

    .line 11
    .line 12
    iget-object p0, p0, Lgl3;->d:Lk03;

    .line 13
    .line 14
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p0, p1}, Lad2;->k(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    check-cast p0, Lqo1;

    .line 23
    .line 24
    iget-object p1, p0, Lqo1;->v:Lro1;

    .line 25
    .line 26
    iget-object p1, p1, Lro1;->q:Ljava/util/List;

    .line 27
    .line 28
    invoke-virtual {p0}, Lcx3;->c()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Lcom/eddyizm/tempus/model/HomeSector;

    .line 37
    .line 38
    invoke-virtual {p0, p2}, Lcom/eddyizm/tempus/model/HomeSector;->setVisible(Z)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_1
    check-cast p0, Lcom/google/android/material/chip/Chip;

    .line 43
    .line 44
    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->w:Lth2;

    .line 45
    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    check-cast v0, Lhg3;

    .line 49
    .line 50
    iget-object v0, v0, Lhg3;->o:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Ly10;

    .line 53
    .line 54
    if-eqz p2, :cond_0

    .line 55
    .line 56
    invoke-virtual {v0, p0}, Ly10;->b(Lcom/google/android/material/chip/Chip;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    iget-boolean v1, v0, Ly10;->c:Z

    .line 64
    .line 65
    invoke-virtual {v0, p0, v1}, Ly10;->m(Lcom/google/android/material/chip/Chip;Z)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_1

    .line 70
    .line 71
    :goto_0
    invoke-virtual {v0}, Ly10;->g()V

    .line 72
    .line 73
    .line 74
    :cond_1
    iget-object p0, p0, Lcom/google/android/material/chip/Chip;->v:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 75
    .line 76
    if-eqz p0, :cond_2

    .line 77
    .line 78
    invoke-interface {p0, p1, p2}, Landroid/widget/CompoundButton$OnCheckedChangeListener;->onCheckedChanged(Landroid/widget/CompoundButton;Z)V

    .line 79
    .line 80
    .line 81
    :cond_2
    return-void

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
