package ru.rambler.it.presentation.view.activities;// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).

import dagger.MembersInjector;
import javax.inject.Provider;
import ru.rambler.it.presentation.presenter.MainScreenPresenter;

public final class MainActivity_MembersInjector2 implements MembersInjector<MainActivity> {
    private final Provider<MainScreenPresenter> presenterProvider;

    public MainActivity_MembersInjector2(Provider<MainScreenPresenter> presenterProvider) {
        assert presenterProvider != null;
        this.presenterProvider = presenterProvider;
    }

    public static MembersInjector<MainActivity> create(
            Provider<MainScreenPresenter> presenterProvider) {
        return new MainActivity_MembersInjector2(presenterProvider);
    }

    @Override
    public void injectMembers(MainActivity instance) {
        if (instance == null) {
            throw new NullPointerException("Cannot inject members into a null reference");
        }
            instance.presenter = presenterProvider.get();
    }
}
