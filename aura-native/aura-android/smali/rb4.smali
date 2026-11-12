.class public final synthetic Lrb4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Landroidx/preference/Preference;


# direct methods
.method public synthetic constructor <init>(Landroidx/preference/Preference;I)V
    .locals 0

    .line 1
    iput p2, p0, Lrb4;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lrb4;->o:Landroidx/preference/Preference;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lrb4;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Lrb4;->o:Landroidx/preference/Preference;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, Landroidx/preference/SwitchPreference;

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Landroidx/preference/TwoStatePreference;->E(Z)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    check-cast p0, Landroidx/preference/SwitchPreference;

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Landroidx/preference/TwoStatePreference;->E(Z)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_1
    check-cast p0, Landroidx/preference/SwitchPreference;

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Landroidx/preference/TwoStatePreference;->E(Z)V

    .line 24
    .line 25
    .line 26
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
